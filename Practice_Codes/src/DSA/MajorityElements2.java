package DSA;

import java.util.*;

//https://leetcode.com/problems/majority-element-ii/description/
//229 - Majority Elements II

public class MajorityElements2 {
    public static void main(String[] args) {
        int[] arr = {1, 2,1};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                list.add(key);
            }
        }
        return list;
    }
}

