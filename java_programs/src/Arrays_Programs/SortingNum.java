package Arrays_Programs;
//Write a program for sorting the array.
import java.util.Scanner;

public class SortingNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
	

}
