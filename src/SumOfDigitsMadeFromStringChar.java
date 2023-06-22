public class SumOfDigitsMadeFromStringChar {

    public static void main(String[] args) {
        System.out.println(convertCharToNumber("IIII",1));
    }

    static int convertCharToNumber(String str,int k){
        //Convert this string to char array and find the sum of each character by character.
        //ch-'a' means   suppose character is b then asci value of b - ascci value of a (96-95=1) and add 1 to it so it
        //gives us b=2 similarly for c and ....
        //calculate the sum of each digit since we are iterating over the length of string by converting it into charArray
        //find sumof the digit.
        int sum=0;
        for(char ch : str.toCharArray()){
            sum+=sumOfDigits(ch-'a'+1);
        }

        //For repertion as Number of times K is given
        //Calculate sum for first iteration from above and now use that sum to be calculated in this loop.
        //Calculate the sum and keep decremnting the value of k
        //doing k-1 because we have already considered one iteration above.
        while(k-1>0){
        sum=sumOfDigits(sum);
        k--;
        }
        return sum;
    }

    static int sumOfDigits(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem;
            num/=10;
        }
        return ans;
    }
}
