package Arrays_Programs;

import java.util.Scanner;

//Write a program to print the array in reverse order.
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
