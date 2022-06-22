package com.codedifferently.assessment01.part01;

import java.util.stream.IntStream;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        int product = 1;
        for (int i = 0; i < intArray.length; i++)
            product = product * intArray[i];
        return product;
        }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        int sum = IntegerArrayUtils.getSum(intArray);
        Double avg = Double.valueOf(sum/ intArray.length);
        return avg;
    }
}
