package java_programs;
//Program to add the first and last digit of given number?

public class AddFirstAndLast {

	public static void main(String[] args) {
		int n=773965;
		int fn=n;
		int sum=0;
		while(fn>=10) {
			fn=fn/10;
			
		}
//		System.out.println(fn);
		int ld=n%10;
		sum=fn+ld;
		System.out.println(sum);
		
		
		
		
		
//		int n=35768;
//		int sum=0;
//		int fd=0;
//		int ld=n%10;
//		while(n!=0) {
//			fd=n%10;
//			n/=10;
//		}
//		sum=fd+ld;
//		System.out.println(fd+""+ld+sum);
	}
}
