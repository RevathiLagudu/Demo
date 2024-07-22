package java_programs;
//Program to check whether the given number is prime or not
public class PrimeNum {

	public static void main(String[] args) {
		int n=153;
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println(c+": is prime");
		else
			System.out.println("not a prime");
	}
}
