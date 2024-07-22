package Arrays_Programs;

import java.util.Scanner;

//Write a program to count number of positive and negative numbers in the array.
public class PosAndNegNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int pc=0;
		int nc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) 
				pc++;
			else 
				nc++;
		}
		System.out.println(pc);
		System.err.println(nc);
	}
}
