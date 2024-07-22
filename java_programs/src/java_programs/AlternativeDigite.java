 package java_programs;

import java.util.Scanner;

//Program to print the sum of alternative digits in a given number? 
public class AlternativeDigite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		int p=0,sum=0;
		while(rev!=0) {
			p++;
			if(p%2==1) {
				int r=rev%10;
//				res=res*10+r;
				sum=sum+r; 
			}
			rev=rev/10;
		}
		System.out.println(sum);
	}
}
