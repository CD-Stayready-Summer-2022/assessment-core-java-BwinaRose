package com.codedifferently.assessment01.part01;

import java.util.Locale;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        String[] splitStr = sentence.split("\\s+");
        return splitStr;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){
        String[] words = StringUtils.getWords(sentence);
        return words[0];
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        String firstWord = StringUtils.getFirstWord(sentence);
        String revFirstWord = BasicStringUtils.reverse(firstWord);
        return revFirstWord;
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        String revFirstWordAndLowerCase = StringUtils.reverseFirstWord(sentence).toLowerCase();
        return BasicStringUtils.camelCase(revFirstWordAndLowerCase);}

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder builderStr = new StringBuilder(str);
        return builderStr.deleteCharAt(index).toString();
    }
}
