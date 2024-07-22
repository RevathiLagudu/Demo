package Arrays_Programs;

import java.util.Scanner;

//Take a 3 digits number and print in reverse order using array.
public class ReverseOrderFrom3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 digit number");
			int n=sc.nextInt();
			int arr[]=new int[3];
			for(int j=0;j<3;j++) {
				arr[j]=n%10;
				n=n/10;
				System.out.print(arr[j]);
			}
			
	}
}
