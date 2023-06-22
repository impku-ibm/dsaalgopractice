
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
   int[][] arr={
           {10,20,20,40},
           {15,25,35,45},
           {28,29,37,49},
           {33,38,44,50}
   };
        System.out.println(Arrays.toString(search(arr,20)));
    }

    static int[] search(int [][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while (row<arr.length && col>=0){
            //we have to make three checks
            if(target==arr[row][col]){
                return new int[]{row,col};
            }if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
