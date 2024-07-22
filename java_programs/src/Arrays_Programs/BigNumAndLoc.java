package Arrays_Programs;

import java.util.Scanner;

//Find biggest element in the array with location.
public class BigNumAndLoc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int c=0;
		int a=0;
		for(int i=0;i<n;i++) {
			c++;
			if(arr[i]>max) {
				max=arr[i];
				 a=c;
			}
		}
		System.out.println(max+"in"+ a+"location");
	}
}
