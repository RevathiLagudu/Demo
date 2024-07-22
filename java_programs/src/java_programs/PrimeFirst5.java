package java_programs;
//Program to generate first 5 prime numbers 

public class PrimeFirst5 {

	public static void main(String[] args) {
		int i=1,c=0;
		while(c<5) {
			int fc=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					fc++;
				}
			}
			if(fc==2) {
				System.out.println(i);
				c++;
			}
			i++;
		}
	}
}
