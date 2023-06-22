public class SquareRootUsingBS {
    public static void main(String[] args) {
        System.out.println(binarySearch(8));
    }

    static int binarySearch(int num){
      int start=2;
      int end=num;
      while(start<=end){
          int mid=start + (end-start)/2;
          if(mid*mid==num){
              return mid;
          }else if(mid*mid>num){
              end=mid-1;
          }else{
              start=mid+1;
          }
      }
      return end;
    }
}

