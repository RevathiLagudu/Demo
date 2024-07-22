package java_programs;
//print number of digits in a number 
public class NoOfDigits {
	public static void main(String[] args) {
		int n=87654;
		int c=0;
		while(n!=0) {
			int r=n%10;
			c++;
			n/=10;
		}
		System.out.println(c+"digits");
	}
}
