public class BSRecurssion {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,5,0,arr.length-1));
    }

    //We will pass start and end since these are to be passed in future calls
    //of this function so we put in argument.
    static  int search(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        //mid is specific to this call only so it inside this method.
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target<nums[mid]){
           return search(nums,target,start,mid-1);
        }else{
           return search(nums,target,mid+1,end);
        }
    }
}
