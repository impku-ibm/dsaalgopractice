public class ReverseDigit {

    static int sum=0;
    static void reverse(int num){
        if(num==0){
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        reverse(num/10);
    }

    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }

}
