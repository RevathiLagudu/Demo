package Arrays_Programs;

import java.util.Scanner;

//Write a program to print the odd position elements.
public class OddPositionNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
