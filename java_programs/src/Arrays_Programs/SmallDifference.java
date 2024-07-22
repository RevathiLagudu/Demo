package Arrays_Programs;

import java.util.Scanner;

//Find the pair which has small difference in the array.
public class SmallDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
			int n=sc.nextInt();
			int arr[]=new int[10];
			System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		int c=arr.length-1,var1=0,var2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				int d=arr[i]-arr[j];
				if(arr[i]==arr[j]) {
					break;
				}
				if(d<0) {
					d*=-1;
				}
				if(c>d) {
					c=d;
					var1=arr[i];
					var2=arr[j];
				}
			}
		}
		System.out.println(var1+":"+var2+"="+c);
	}
}
