package com.dataStruct;

import java.util.Arrays;
import com.dataStruct.ArrayStruct;

public class Main {

        public static void main(String[] args) {

            int[] rollArray = {1,12,3,53,56,78,8};
            System.out.println("Current Array :" + Arrays.toString(rollArray));

            //intialise Array strcut
            ArrayStruct arrayStruct = new ArrayStruct();

            //reverse Method
            int[] reverse = arrayStruct.reverse(rollArray);
            System.out.println("Reverse Array :"+Arrays.toString(reverse));


        }
}
