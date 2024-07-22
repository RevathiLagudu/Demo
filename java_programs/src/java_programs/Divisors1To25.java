package java_programs;
//Which integer between 1 and 25 has the largest number of divisors, and how many divisors does it have? Write a program to print out the results. It is possible that several integers in this range have the same, maximum number of divisors. Your program only has to print out one of them. 

public class Divisors1To25 {

	public static void main(String[] args) {
		int num=0;
		int max=0;
		for(int i=1;i<=25;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count>max) {
				max=count;
				num=i;
			}
		}
		System.out.println(num+"="+max);
	}
}
