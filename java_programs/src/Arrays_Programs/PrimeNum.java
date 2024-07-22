package Arrays_Programs;

import java.util.Scanner;

//Write a program to print prime numbers in the given array.
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the valu");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=n;i++) {
			int c=0;
			for(int j=1;j<=arr[i];j++) {
			if(arr[i]%j==0) {
				c++;
			}
			}
		if(c==2) {
			System.out.println(arr[i]);
		}
		
		}
	}
}
