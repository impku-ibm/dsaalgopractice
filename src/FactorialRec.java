public class FactorialRec {
    public static void main(String[] args) {
        int ans= fact(5);
        System.out.println(ans);
    }

    static int fact(int num){
        if(num==1) {
            return 1;
        }
        return num*fact(num-1);
    }
}
