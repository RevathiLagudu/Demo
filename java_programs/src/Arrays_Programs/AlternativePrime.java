package Arrays_Programs;

import java.util.Scanner;

//Print alternative prime numbers in the given array.
public class AlternativePrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
			int n=sc.nextInt();
			int arr[]=new int[10];
			System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i+=2) {
			int c=0;
			for(int j=1;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(arr[i]);
			}

		}
	}
}
