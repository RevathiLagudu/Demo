package java_programs;
//Program to check whether the given term is Fibonacci term or not
public class FibonacciOrNot {

	public static void main(String[] args) {
		int n=100;
		int n1=0,n2=1,n3=n1+n2;
		while(n3<n) {
//			System.out.println(n1+" "+n2);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
		if(n3==n)
			System.out.println("it is fibonacci");
		else
			System.out.println("it is not a fibonacci");
	}
}
