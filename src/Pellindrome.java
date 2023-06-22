public class Pellindrome {

    public static void main(String[] args) {
        int x=-121;
        String str = String.valueOf(x);
        int j=str.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Pellindrome");
                break;
            }
            j--;
        }
        System.out.println("Pelindrome");
    }
}
