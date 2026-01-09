package org.example;
import java.util.*;
public class Main {
    public static int display(int[] nums) {
        int count = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == count) {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0) {
                count = nums[i];
                sum++;
            }
        }

            return count;
        }




    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(display(nums));

    }
    }
