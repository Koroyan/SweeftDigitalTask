package com.example;

import java.util.List;

public class Examples {
    static boolean  isPalindrome(String text){
        for (int i = 0; i<text.length();i++)
            if(text.charAt(i)!=text.charAt(text.length()-1-i))
                return false;
        return true;
    }
    /*   static int minSplit(int amount){
          int count=0;
          count += amount/50;
          amount%=50;
          count +=amount/20;
          amount%=20;
          count += amount/10;
          amount%=10;
          count+=amount/5;
          amount%=5;
          count+=amount;
          return count;
       }*/
    static int minSplit(int amount){
        List<Integer> array = List.of(50,20,10,5,1);
        int count=0;
        for (Integer integer : array) {
            count += amount / integer;
            amount %= integer;
        }
        return count;
    }
    static int notContains(int[] array){
        boolean isNotEquals;
        int i = 0;
        while (true){
            isNotEquals = true;
            i++;
            for (int k : array) {
                if (i == k) {
                    isNotEquals = false;
                    break;
                }
            }
            if (isNotEquals){
                return i;
            }
        }
    }
    static boolean isProperly(String sequence){
        int x=0;
        for (int i = 0;i<sequence.length();i++){
            if(sequence.charAt(i)=='(')
                x++;
            if(sequence.charAt(i)==')')
                x--;
        }
        return x==0;
    }
    static int countVariants(int stearsCount)
    {
        int t1=1; int t2 = 2;
        int sum = 0;
        if(stearsCount==1 || stearsCount==2)return stearsCount;
        for (int i = 1; i < stearsCount-1; ++i)
        {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }
}
