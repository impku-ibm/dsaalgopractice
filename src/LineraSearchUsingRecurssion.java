import java.util.ArrayList;

public class LineraSearchUsingRecurssion {
    public static void main(String[] args) {
        int[] arr={1,4,2,7,2,8};
        int target=2;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(linearSearch(arr,target,0,list));
    }

    static boolean linearSerach(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linearSerach(arr,target,index+1);
    }

    static ArrayList linearSearch(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return linearSearch(arr,target,index+1,list);
    }
}
