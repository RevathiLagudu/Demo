package java_programs;
//Check whether the number is Palindrome or not. 

public class Palindrome {

	public static void main(String[] args) {
		int n=876;
		int temp=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
	}
}
