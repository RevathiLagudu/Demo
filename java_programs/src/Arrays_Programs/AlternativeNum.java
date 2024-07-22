package Arrays_Programs;

import java.util.Scanner;

//Write a program to accept an print alternative numbers in the given array

public class AlternativeNum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the value");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
	for(int i=0;i<n;i+=2) 
		System.out.println("Alternative numbers is:"+arr[i]);
		
	}
}
