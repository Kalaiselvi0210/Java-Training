package org.example;
import java.util.*;

public class Main {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] arr, int target, int start,
                           List<Integer> temp, List<List<Integer>> result) {


        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }


        for (int i = start; i < arr.length; i++) {

      
            if (target < arr[i]) continue;

 
            temp.add(arr[i]);


            backtrack(arr, target - arr[i], i, temp, result);

           
            temp.remove(temp.size() - 1);
        }
    }


    public static void main(String[] args) {
        Main obj = new Main();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = obj.combinationSum(candidates, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
