package com.dataStruct;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStruct {

    public  int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }

        return arr;
    }
    public int[] swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }


    public  ArrayList<Integer> arrListreverse(ArrayList<Integer> arrList) {
        int start = 0;
        int end = arrList.size() -1;

        while(start < end ) {
            arrListswap(arrList,start,end);
            start++;
            end--;
        }

        return arrList;
    }
    public ArrayList<Integer> arrListswap(ArrayList<Integer> arrList,int index1,int index2) {
        int temp = arrList.get(index1);
        arrList.set(index1,arrList.get(index2));
        arrList.set(index2,temp);

        return arrList;
    }




}
