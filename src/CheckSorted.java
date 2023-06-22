public class CheckSorted {
    public static void main(String[] args) {
        int[] arr ={2,4,90,6,7,8,9};
        System.out.println(checkSorted(arr,0));
    }

    static boolean checkSorted(int[] arr ,int indx){
        if(indx==arr.length-1){
            return true;
        }
        return arr[indx]<arr[indx+1] && checkSorted(arr,indx+1);
    }
}
