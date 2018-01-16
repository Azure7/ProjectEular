
public class Q10SumOfPrimes {

	public static boolean checkPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n % i == 0) {
                return false;
            }
        return true;
    }
	
	public static void main(String[] args) {
		long sum = 0;
        for(int i=2; i<2000000; i++) {
            if(checkPrime(i))
                sum += i;
        }
        System.out.println(sum);
	}

}
