public class ValidMountainarray {
    public static void main(String[] args) {
int[] arr={0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        int i=0;
        int end=arr.length-1;
        if(arr.length<3){
            return false;
        }
        while(i<end && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==end) {
            return false;
        }
        while(i<end && arr[i]>arr[i+1]){
            i++;
        }
        return i==end;
    }
}


