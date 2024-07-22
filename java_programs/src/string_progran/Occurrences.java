package string_progran;

import java.util.Scanner;

//program to print the occurrences of each character in a given string
public class Occurrences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();  
		for(int i=0;i<str.length();i++) {
			int c=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)&&i>j) {
					break;
				}
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(c>0) {
				System.out.println("the no of occurrences is :"+str.charAt(i)+"="+c);
			}
		}
	}
}
