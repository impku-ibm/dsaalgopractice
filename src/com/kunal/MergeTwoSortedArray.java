package com.kunal;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
   int[] arr={2,3,1,5,7,4,9,8};
  int[] ans= mergeSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] arr1,int[] arr2){
        int[] ans =new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while (j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}
