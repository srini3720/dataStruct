package com.dataStruct;

import java.util.ArrayList;
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


            //ArrayList
            ArrayList<Integer> rollList = new ArrayList<Integer>(Arrays.asList(12,45,78,98,65,12,65,4));
            System.out.println("Current  Arraylist :"+rollList.toString());

            ArrayList reverseList = arrayStruct.arrListreverse(rollList);

            // reverse arrayList
            System.out.println("Reversed Arraylist :"+reverseList.toString());


        }
}
