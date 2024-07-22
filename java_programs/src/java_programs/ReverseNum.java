package java_programs;
//Print reverse of a number
public class ReverseNum {

	public static void main(String[] args) {
		int n=2345;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}
}
