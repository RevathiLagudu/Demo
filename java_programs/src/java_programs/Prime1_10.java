package java_programs;
//Program to print the prime numbers between 1 to 10
public class Prime1_10 {
	public static void main(String[] args) {
		int a=1,b=10;
		for(int i=a;i<=b;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2)
				System.out.println(i);
		}
	}

}
