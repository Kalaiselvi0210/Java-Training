package org.example;
import java.util.*;
public class Main {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int currentSize = result.size();
            for (int i = 0; i < currentSize; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);}}
        return result;}
    public static void main(String[] args) {
        Main sol = new Main();
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = sol.subsets(nums);
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);}}}
