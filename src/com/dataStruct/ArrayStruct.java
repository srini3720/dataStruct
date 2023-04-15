package com.dataStruct;

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


}
