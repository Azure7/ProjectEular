
public class Q4Palindrome {
	
	public static int CheckPalindrome(String number) {
		if (number.length() == 0 || number.length() == 1) {
			return 1;
		}
		if (number.charAt(0) == number.charAt(number.length()-1)) {
			return 1*CheckPalindrome(number.substring(1,number.length()-1));
		}
		return 0;
	}
	
	public static void main(String[] args) {
		for (int i = 999; i>99; i--){
			for (int j = i; j>99; j--) {
				int n = i*j;
				int isPalin = CheckPalindrome(Integer.toString(n));
				if (isPalin == 1) {
					System.out.println(n);
					break;
				}
			}
		}
	
	}

}
