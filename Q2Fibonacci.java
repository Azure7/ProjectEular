public class Q2Fibonacci {

	public static void main(String[] args) {
		int sum = 0;
		int a_3 = 8;
		int a_6 = 2;
		int a = 0;
		
		while(a_6<4000000){
			sum += a_6;
			a = 4*a_3 + a_6;
			a_6 = a_3;
			a_3 = a;
		}
		
		System.out.println(sum);
		
	}

}
