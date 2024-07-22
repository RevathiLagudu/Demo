package Arrays_Programs;

import java.util.Scanner;

//Find the target element is there or not in the array.
public class TargetNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the target num");
		int target=sc.nextInt();
		System.out.println("enter the value");
		int c=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
				if(arr[i]==target) {
					c++;
				}
		
		}
		if(c>0) {
			System.out.println(c+"the target number is present");
		}
		else {
			System.out.println("target number is not present");
		}
	}
}
