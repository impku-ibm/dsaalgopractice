public class IntegerToString {
    public static void main(String[] args) {
        System.out.println(powtwo(81));
    }

    static boolean powtwo(int n){
        if(n%2==0){
            return false;
        }
        while(n!=1){
            System.out.println(n);
            if(n%3==0) {
                System.out.println(n);
                n /= 3;
            }else{
                return false;
            }
        }
        if(n==1){
            return true;
        }
        return false;
    }
}
