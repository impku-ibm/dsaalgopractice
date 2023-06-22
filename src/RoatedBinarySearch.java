public class RoatedBinarySearch {

    public static void main(String[] args) {
int [] arr={3,4,5,6,7,8,0,1,2};
        System.out.println(arr[pivotElm(arr)]);
    }

    static int pivotElm(int [] nums){
       int start=0;
       int end=nums.length-1;
       while(start<end){
           int mid = start +(end-start)/2;
           if(mid>end && nums[mid]>nums[mid+1]){
               return mid;
           }
          if(start<mid && nums[mid]<nums[mid-1]){
               return mid-1;
           }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
       }
       return -1;
    }
}
