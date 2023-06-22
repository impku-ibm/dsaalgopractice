import java.util.StringTokenizer;

public class CountNumbersFromSentence{
    public static void main(String[] args) {
        String str = "1 Pankaj Kumar 9 3 Upadhyay";
        System.out.println(checkInString(str));
    }

    public static boolean checkInString(String str) {
        int prev = 0;
        for (String st : str.split(" ")) {
            try{
                int current = Integer.parseInt(st);
                if (current <= prev) {
                    return false;
                } else
                    prev = current;

            }catch (Exception ex){

            }

        }
        return true;
    }
}
