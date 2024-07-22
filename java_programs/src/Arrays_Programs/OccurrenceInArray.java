package Arrays_Programs;

import java.util.Scanner;

//Occurrence/frequency of each element in the array.
public class OccurrenceInArray {

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
			int c=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j]&&i>j) {
						break;
				}
					if(arr[i]==arr[j]) {
						System.out.println(arr[j]+"="+c);
						break;
				}
			}
		}
	}
}
