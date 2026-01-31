package org.example;
import java.util.*;
public class Main {
    public static int[] display(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        k = k % n;
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
         nums[i]=res[i];
        }

return res;
}

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        display(nums,k);
        System.out.println(Arrays.toString(nums));

    }
}
