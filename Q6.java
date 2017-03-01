
public class Q6 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++)
			sum = sum + i*i;
		int square = 5050*5050;
		int dif = Math.abs(sum-square);
		System.out.println(dif);
	}

}
