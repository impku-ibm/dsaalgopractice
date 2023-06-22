package com.kunal.recusrsionsorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
int[] arr = {5,4,6,7,1,3,8};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr,row,col+1);
        }else{
            bubbleSort(arr,row-1,0);
        }
    }
}
