import java.math.BigInteger;
public class Q15Combinatorics {

	public static void main(String[] args) {
		// Combinatorics problem. choose 20 out of 40 unit length to go down.
		// C(40 20)= 40!/(20!*20!)	
				
		BigInteger a = factorial(40);
		BigInteger b = factorial(20);
		BigInteger c = a.divide(b).divide(b);
		System.out.println(c);	
	}
			
	public static BigInteger factorial(int n){
		BigInteger result = BigInteger.valueOf(1);
		while(n>0){
			result = result.multiply(BigInteger.valueOf(n));
			n--;
		}
		return result;
	}

}


