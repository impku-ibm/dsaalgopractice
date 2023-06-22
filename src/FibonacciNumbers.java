public class FibonacciNumbers {

    public static void main(String[] args) {
        int ans = findFibo(4);
        System.out.println(ans);
    }

    static int findFibo(int n){
        //base condition
        if(n<2){
            return n;
        }
      return findFibo(n-1)+findFibo(n-2);

    }
}
