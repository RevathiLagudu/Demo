package Arrays_Programs;

import java.util.Scanner;

//In which order is the given array. (Ascending/descending/disorder).
public class OrderOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean ase=true;
		boolean des=true;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				ase=false;
			}
			if(arr[i]<arr[i+1]) {
				des=false;
			}
		}
		if(ase)
			System.out.println("ascending order");
		else if(des)
			System.out.println("descending order");
		else
			System.out.println("disorder");
	}
}