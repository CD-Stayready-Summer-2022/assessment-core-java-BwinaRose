package com.codedifferently.assessment01.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        char[] charArray = input.toCharArray();
        int lengthOfString = input.length();
        int count = lengthOfString;
        for (int i = 0; i < lengthOfString - 1; i++){
            int left = i, right = i + 1;
            while (left >= 0 && right < lengthOfString){
                if (charArray[left] == charArray[right]){
                    count++;
                    left--;
                    right++;
                }else break;
            }
            left = i -1;
            right = i + 1;
            while (left >= 0 && right < lengthOfString){
                if (charArray[left] == charArray[right]){
                    count++;
                    left--;
                    right++;
                }else break;
            }
        }return count;
    }
}
