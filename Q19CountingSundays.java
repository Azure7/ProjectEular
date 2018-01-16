
public class Q19CountingSundays {

	public static int daysThisMonth(int y, int m) {
		if (m==2) {
			if (y%4==0&&y%100!=0 || y%400==0) {
				//System.out.print("aaaaaaaaaaaaaaaa"+y);
				return 29;
			}
			else return 28;
		}
		else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 | m==12)
			return 31;
		else 
			return 30;
	}
	
	public static int getWeekday(int y, int m, int start){
		int x = daysThisMonth(y,m)%7;
		int weekday = (start+x)%7;
		return weekday;
	}
	
	public static void main(String[] args) {
		int start = 1;
		int result = 0;
		for (int y=1900; y<2001; y++) {
			for (int m=1; m<13; m++) {
				int n = getWeekday(y,m,start);
				//System.out.println("n="+n);
				if (n==0) {
					//eliminates the results in 1900 and in 2001
					if ((y==1900 && m==12) || (y!=1900) && (!(y==2000 && m==12))) {
						result = result + 1;
					}
				}
				start = n;
			}
		}
		System.out.print(result);
	}
	

}
