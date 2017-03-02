import java.math.BigInteger;

public class Q16PowerDigitSum {

	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(2);
		a = a.pow(1000);
		String b = a.toString();
		int sum = 0;
		for (int i = 0; i < b.length(); i++)
		{
			int d = Integer.parseInt(new Character(b.charAt(i)).toString());
			sum = sum + d;
		}
		System.out.print(sum);

	}

}
