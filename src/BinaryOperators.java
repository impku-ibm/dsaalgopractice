public class BinaryOperators {

    public static void main(String[] args) {
        //finding odd and even
        //if odd true else false
        System.out.println(findOdd(4));

        //Given an array of number find the unique number
        int [] arr ={1,3,4,5,1,3,6,7,8,7,6,5,8};
        int ans = findUnique(arr);
        System.out.println(ans);

        //Find ith Bit of a number
        //Use left shift operator 1<<n-1(mask we will get)
      //  n&&(1<<n-1);
        System.out.println( findIthBit(10));

        //Question:- Set the ith bit


    }

    static boolean findOdd(int num){
        if(num<=0){
            return false;
        }
        return (num&1)==1;
    }

    static int findUnique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }

    static int findIthBit(int num){
        return num &(1<<num-1);
    }
}
