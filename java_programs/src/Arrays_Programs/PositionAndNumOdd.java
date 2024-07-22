package Arrays_Programs;

import java.util.Scanner;
//Print the elements which have position and element have to be odd.
public class PositionAndNumOdd {

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
			if(arr[i]%2!=0 && i%2!=0 ) {
				System.out.println(arr[i]+"in"+i+"position");
			}
		}
	}
}
