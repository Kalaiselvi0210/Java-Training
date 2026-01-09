package org.example;
import java.util.*;
public class Main {
    public  static boolean display (int[][] nums) {
        Arrays.sort(nums, (a,b)->a[0]-b[0]);
     for(int i=0;i<nums.length;i++){
         System.out.println(Arrays.toString(nums[i]));
     }
        for(int i=1;i<nums.length;i++){

         if(nums[i][0]<nums[i-1][1]){
             return false;
         }

        }
        return true;


    }
        public static void main(String[] args){
            int[][] nums={
                    {5,6},{1,2},{7,8},{3,4}
            };
            System.out.println(display(nums));

        }
            }

