public class ClimbStarirs {
    public static void main(String[] args) {
        System.out.println(climb(5));
    }

    static int climb(int num){
        if(num<=2){
            return num;
        }
        int first=1;
        int sec=2;
        for(int j=2;j<num;j++){
            int temp=first;
            first=sec;
            sec=temp+sec;
        }
        return sec;
    }
}
