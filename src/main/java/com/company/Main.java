package com.company;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) throws RuntimeException {
        Integer [] arr = {1,1,2,4};
        Integer [] arr2 = {1,1,1,1};
        Integer [] arr3 = {4,4,4,4};
        Integer [] arr4 = {4,4,1,4,};
        OneAndFour test = new OneAndFour();

        System.out.println(test.OneAndFourMethod(arr4));

    }


}
