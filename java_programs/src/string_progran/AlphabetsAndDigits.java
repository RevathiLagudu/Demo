package string_progran;

import java.util.Scanner;

//program to accept an alpha numeric string and count the nubmer of alphabets and digits
public class AlphabetsAndDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int ac=0,dc=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				ac++;
			}
			else if(ch>='0' && ch<='9') {
				dc++;
			}
			else {
				ch=' ';
				ch=0;
			}
			
		}
		System.out.println(" no of alphabets:"+ac);
		System.out.println("no of digits"+dc);
		}
}
