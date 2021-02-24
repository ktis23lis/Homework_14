package com.company;

import java.util.Arrays;

public class ArrayCopy {


    public Integer[] arrayCopyFromBefore(Integer[] arr) throws RuntimeException {

        Integer[] arr2 = new Integer[0];
        Integer a = Arrays.asList(arr).lastIndexOf(4);
        if (arr[a]!=4)throw new RuntimeException();

        if (arr[a] == 4) {
            Integer startIndexNewArr = a + 1;
            for (Integer i = startIndexNewArr; i < arr.length; i--) {
                Integer f = arr.length - startIndexNewArr;
                arr2 = new Integer[f];
                System.arraycopy(arr, startIndexNewArr, arr2, 0, f);
                for (Integer j = 0; j < arr2.length; j++) {
                    System.out.println(arr2[j]);
                }
                break;
            }
        }
        return arr2;
    }
}
