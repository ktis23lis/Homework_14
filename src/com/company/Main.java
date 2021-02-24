package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) throws RuntimeException {
        Integer[] arr = {4, 4, 2, 4, 3, 5, 7, 8};
        arrayCopyFromBefore(arr);

    }

    private static void arrayCopyFromBefore (Integer[] arr) throws RuntimeException{
        try {
            Integer a = Arrays.asList(arr).lastIndexOf(4);
            if (arr[a] == 4) {
                Integer startIndexNewArr = a + 1;
                for (int i = startIndexNewArr; i < arr.length; i--) {
                    int f = arr.length - startIndexNewArr;
                    Integer[] arr2 = new Integer[f];
                    System.arraycopy(arr, startIndexNewArr, arr2, 0, f);
                    for (int j = 0; j < arr2.length; j++) {
                        System.out.println(arr2[j]);
                    }
                    break;
                }
            }

        }catch (Exception e){
            throw new RuntimeException("There is no 4 in the array");
        }
    }
}

