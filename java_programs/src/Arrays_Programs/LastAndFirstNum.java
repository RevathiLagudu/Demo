package Arrays_Programs;
//Write a program to accept an array and print it from last to element to first element.
import java.util.Scanner;

public class LastAndFirstNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=n-1;i>=0;i--) 
			System.out.println("last to first numbers is:"+arr[i]);
			
	}
}
