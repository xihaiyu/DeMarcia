package com.ctrip.asp.commom.spring;

/**
 * Created by Jing on 2017/7/31 0031.
 */
public class RouteInfo {

        private String method;
        private String type;
        private String pmsCode;

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPmsCode() {
            return pmsCode;
        }

        public void setPmsCode(String pmsCode) {
            this.pmsCode = pmsCode;
        }
}
