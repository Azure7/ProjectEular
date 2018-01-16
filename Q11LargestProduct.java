import java.math.BigInteger;
public class Q11LargestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = factorial(100);
		String b = a.toString();
		int sum = 0;
		for (int i = 0; i < b.length(); i++)
		{
			int d = Integer.parseInt(new Character(b.charAt(i)).toString());
			sum = sum + d;
		}
		System.out.print(sum);
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
