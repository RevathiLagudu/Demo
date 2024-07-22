package java_programs;
//Find small digit in a number along with location.  (Ex :7486    4 is small and located at 3rd position)

public class SmallNumLocation {

	public static void main(String[] args) {
		int n=1576;
		int c=0,rem=0;
		int small=9999;
		int loc=0;
		while(n!=0) {
			int r=n%10;
			c++;
			if(r<small) {
				small=r;
				loc=c;
			}
			n/=10;
		}
		System.out.println(small+":is a small num in "+loc+" position");
	}
}
