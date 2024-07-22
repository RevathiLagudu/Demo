package java_programs;
//Print 10 Fibonacci terms 
public class FibonacciNum {
	public static void main(String[] args) {
		int n=100;
		int n1=0,n2=1,n3=n1+n2;
		while(n3<=n) {
//			System.out.println(n1+" "+n2);
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
		}
	}
	
}
