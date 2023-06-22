import java.util.List;

public class ListAdditionRec {
    public static void main(String[] args) {
int [] arr ={2,4,6,8,9};
        System.out.println(addition(arr,arr.length-1));
    }

    static  int addition(int[] arr , int len){
        if(len==0){
            return arr[0];
        }
        return arr[len]+addition(arr,len-1);
    }
}
