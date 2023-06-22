import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
int[] arr={1,2,3,3,4,5,5};
removeDuplicates(arr);
    }

    static void removeDuplicates(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k< arr.length;k++) {
            System.out.println(arr[k]);
        }
       // return i+1;
    }
}
