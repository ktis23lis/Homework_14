package com.company;

import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.Arrays;

public class OneAndFour {
    public boolean OneAndFourMethod (Integer [] arr){
        boolean one = false;
        boolean four = false;
        for (int i: arr) {
            if(i != 1 && i!=4) return false;
            if(i == 1) one = true;
            if(i == 4) four = true;
        }
        return one && four;
    }

}
