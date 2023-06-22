public class PrimeSeive {
    public static void main(String[] args) {
int num=37;
boolean[] prime=new boolean[num+1];
seive(num,prime);
    }

    static void seive(int n , boolean[] prime){
        for(int i=2;i*i<=n;i++){
            //Loop to check if in boolean array its,true or false
            if(!prime[i]){
                //To discard all the multiples whose factors we have identified
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        //This will print all the false from boolean array i mean the prime
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    //Time complexicity is n*log(log(n))
}
