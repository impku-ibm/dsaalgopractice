public class SimpleRecurssion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int num){

        //Base condition
       if(num==5){
           System.out.println(5);
           return;
       }
        System.out.println(num);
       print(num+1);
    }
}
