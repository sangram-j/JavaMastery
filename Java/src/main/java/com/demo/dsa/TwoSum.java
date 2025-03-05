package com.sj.demo.dsa;


import java.util.*;

public class TwoSum {

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i); //<7,0>
            }
        }
        return new int[]{};
    }

    //return only one pair
    public static int[] twoSumValuesUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                // Check if the (nums[i]) is already in the map
                return new int[]{map.get(nums[i]), nums[i]};
            } else {
                // Store the (target - nums[i]) as the key and the current number as the value
                map.put(target - nums[i], nums[i]);
            }
        }
        return new int[]{};
    }

    //returns all pairs
    public static List<int[]> twoSumPairsValuesUsingHashMap(Integer[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                // Check if the (nums[i]) is already in the map
                list.add(new int[]{nums[i], target - nums[i]});
            } else {
                // Store the (target - nums[i]) as the key and the current number as the value
                map.put(target - nums[i], nums[i]);//here value doesnt matter
            }
        }
        return list;
    }

    public static List<List<Integer>> twoSumValuesUsingSet(List<Integer> list, int targetNo) {
        List<List<Integer>> pairList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(targetNo - list.get(i))) {
                List<Integer> list1 = new ArrayList();
                list1.add(list.get(i));
                list1.add(targetNo - list.get(i));
                pairList.add(list1);
            } else {
                set.add(list.get(i));
            }
        }
        return pairList;
    }

    public static void main(String args[]) {
        int[] nums = {2, 7, 9, 15};
        int target = 16;
        int[] result = twoSumUsingHashMap(nums, target); //will return index whose sum is target no
        int[] result1 = twoSumValuesUsingHashMap(nums, target); //will return values whose sum is target no
        System.out.println("indexes whose sum is target no using twoSumHashMap :- " + Arrays.toString(result));
        System.out.println("values whose sum is target no using twoSumHashMap :- " + Arrays.toString(result1));

        Integer[] nums1 = {2, 7, 9, 10, 8, 15, 8, 6};
        List<List<Integer>> pairList = twoSumValuesUsingSet((Arrays.asList(nums1)), target); //will return values whose sum is target no
        System.out.println("values whose sum is target no using twoSumSet :- " + (pairList));

        List<int[]> pairList2 = twoSumPairsValuesUsingHashMap(nums1, target); //will return values whose sum is target no
        for (int[] pair : pairList2) {
            System.out.println(pair[0] + ", " + pair[1]);
        }

    }
}
