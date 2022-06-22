package com.codedifferently.assessment01.part01;


public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        String[] splitStr = str.split("\\s+");
        String newStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String capitalLetter = splitStr[i].substring(0, 1);
            String remainLetters = splitStr[i].substring(1);
            capitalLetter = capitalLetter.toUpperCase();
            newStr += capitalLetter + remainLetters;
        }
        return newStr;
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder builderStr = new StringBuilder(str);
        builderStr.reverse();
        return builderStr.toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String revStr = BasicStringUtils.reverse(str);
        String camelCaseStr = BasicStringUtils.camelCase(revStr);
        return camelCaseStr;
    }

    public static String removeFirstAndLastCharacter(String str){
        StringBuilder builderStr = new StringBuilder(str);
        return builderStr.deleteCharAt(str.length()-1).deleteCharAt(0).toString();
    }
}
