import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haiyu.xi
 * @create 2018-04-09 15:31
 **/
public class Step {
    private static int[] nums = {3, 9, 5, 8, 6, 3, 4, 7, 9, 2, 1, 5, 1, 1, 1};

    public static List<Integer> minNums(int[] n) {
        List<Integer> result = new ArrayList<Integer>();
        int start = n[0];
        result.add(start);
        int address = 0;
        int step = start;
        int max = 0;
        int i = 1;
        while (step < nums.length) {
            int ss = 0;
            for (int s = i; s <= start; s++) {
                if (max < n[s + address] + s) {
                    System.out.println(s);
                    System.out.println(n[s + address]);
                    max = n[s + address] + s;
                    ss = s;
                }
            }
            i = start - ss + 1;
            start = n[ss + address];
            step = step + start;
            address = i;
            result.add(start);
            max=0;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = minNums(nums);
        System.out.print(integers.toString());
    }
}
