package Arrays_Programs;

import java.util.Scanner;

//Remove duplicate elements in the array.
public class DuplicateNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i>j) {
					break;
				}
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			break;
			}
			}
		}
	}
}
