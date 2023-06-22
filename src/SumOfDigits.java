public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    static int sum(int num){
        if(num==0){
            return 0;
        }
        //num/10 will gives me the remaining number
        //num%10 will give me the remainder basically digits
        return sum(num/10)+(num%10);
    }
}
