public class PrimeNumber {
    public static void main(String[] args) {
      //  int num=57;
        int [] arr = new int[10];
        System.out.println(checkPrime(13));
        for(int i=10;i<=19;i++){
            if(checkPrime(i)){
                System.out.println("Prime:- " + i);
                arr[i]=i;
            }
        }

        for(int j=0;j<arr.length-1;j++){
            int min=1;
            if(arr[j+1]-arr[j]>1){
                min=arr[j+1]-arr[j];
            }
        }
    }

    static boolean checkPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
