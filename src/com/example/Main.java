package com.example;

import com.example.customlist.CustomList;


import static com.example.Examples.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna") + " : " + isPalindrome("ani"));
        System.out.println(minSplit(585));
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 185};
        System.out.println(notContains(a));
        System.out.println(isProperly("(a)((6+6)"));
        System.out.println(countVariants(5));

        CustomList<Integer> customList = new CustomList<>();

        customList.add(1);
        customList.add(8);
        customList.add(2);
        customList.add(5);
        customList.remove(2);
        customList.add(1);
        System.out.println(customList.toString());
        System.out.println(customList.get(3));
    }
}
