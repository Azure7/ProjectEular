import java.math.BigInteger;

public class Q3LargestPrimeFactor {

	public static boolean checkPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n % i == 0) {
                return false;
            }
        return checkDevide(n);
    }
	
	public static boolean checkDevide(int n) {
		BigInteger x = new BigInteger("600851475143");
		BigInteger y = BigInteger.valueOf(n);
		if (x.mod(y) == BigInteger.ZERO) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//776146 approximates sqrt(600851475143)
		for (int i = 775146; i>1; i--) { 
			if(checkPrime(i)) {
				System.out.print(i);
				break;
			};
		}
	}
}
