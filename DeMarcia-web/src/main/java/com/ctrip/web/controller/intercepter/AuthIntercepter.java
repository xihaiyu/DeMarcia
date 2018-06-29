//package com.ctrip.web.controller.intercepter;
//
//import com.ctrip.ssp.common.utils.ConfigUtil;
//import com.ctrip.ssp.exception.ApiValidateException;
//import com.ctrip.ssp.manager.api.base.BaseManager;
//import com.ctrip.ssp.security.AuthConstants;
//import com.ctrip.ssp.security.CypherUtil;
//import org.springframework.http.HttpStatus;
//import org.springframework.util.StringUtils;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class AuthIntercepter extends HandlerInterceptorAdapter {
//
//	@Resource
//	private BaseManager baseManager;
//
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		boolean result = true;
//		String errorMsg = "Authentication is illegal";
//		String userName = null;
//
//		try {
//			String isCurrentPMS = request.getHeader(AuthConstants.HEADER_EXISTING_PMS);
//			if (isCurrentPMS != null && isCurrentPMS.equalsIgnoreCase("true")) {
//				return true;
//			}
//
//			String[] authArr = checkAuthHeader(request);
//
//			userName = authArr[0];
//			String pwd = authArr[1];
//			long timestamp = Long.parseLong(authArr[2]);
//			checkTimestamp(timestamp);
//
//			String pmsId = checkPMSID(request);
//			result =baseManager.CheckPmsSecurity(pmsId,userName, pwd);
//		} catch (Exception e) {
//			result = false;
//
//			if (e instanceof ApiValidateException) {
//				errorMsg = e.getMessage();
//			}
//		}
//
//		if(!result){
//			response.setStatus(HttpStatus.UNAUTHORIZED.value());
//			response.setCharacterEncoding("UTF-8");
//			response.getOutputStream().write(errorMsg.getBytes("utf8"));
//		}
//
//		return result;
//	}
//
//	private String checkPMSID(HttpServletRequest request) {
//		String pmsId = request.getHeader(AuthConstants.HEADER_PMS_ID);
//		if (StringUtils.isEmpty(pmsId)) {
//			throw new ApiValidateException("PMS ID is required");
//		}
//		return pmsId;
//	}
//
//	private void checkTimestamp(long timestamp) {
//		long interval = ConfigUtil.getDefaultProperties().getLong("auth.request.time.interval");
//		long currentTime = System.currentTimeMillis();
//		if (currentTime - timestamp > interval) {
//			throw new ApiValidateException("illegal request time interval");
//		}
//	}
//
//	private String[] checkAuthHeader(HttpServletRequest request) {
//		String encryptAuth = request.getHeader(AuthConstants.HEADER_AUTHENTICATION);
//		if (StringUtils.isEmpty(encryptAuth)) {
//			throw new ApiValidateException("no Authentication header");
//		}
//		String privateKey = ConfigUtil.getDefaultProperties().getString("auth.rsa.private.key");
//		String decryptAuth = CypherUtil.decryptByPrivateKeyRSA(encryptAuth, privateKey);
//		if (StringUtils.isEmpty(decryptAuth)) {
//			throw new ApiValidateException("can't decrypt Authentication header");
//		}
//		String[] authArr = decryptAuth.split("[:]");
//		if (authArr.length != 3) {
//			throw new ApiValidateException("invalid Authentication header");
//		}
//		return authArr;
//	}
//}
