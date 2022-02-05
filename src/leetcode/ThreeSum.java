package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] x){
        Arrays.sort(x);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < x.length - 2; i++) {
            if (i == 0 || (i > 0 && x[i] != x[i-1])) {
                int l = i + 1, r = x.length - 1, sum = 0 - x[i];;
                while(l < r){
                    if (x[l] + x[r] == sum) {
                        result.add(Arrays.asList(x[i], x[l], x[r]));
                        while (l < r && x[l] == x[l + 1]) l++;
                        while (l < r && x[r] == x[r - 1]) r--;
                        l++;
                        r--;
                    } else if (x[l] + x[r] < sum) l++;
                    else r--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = {-1,-2,-3,-4,0,1,1,-1,2,3,0};
        ThreeSum t = new ThreeSum();
        List<List<Integer>> result = t.threeSum(x);
        System.out.println(result);
    }
}
