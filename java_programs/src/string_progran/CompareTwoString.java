package string_progran;

import java.util.Scanner;

//Program to implement an user defined function to compare two strings without using compareTo()
public class CompareTwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();
        if(compare(str1,str2)) {
        	System.out.println("two strings are same");
        }
        else {
        	System.out.println("two strings are not same");
        }
	}
	public static boolean compare(String s1,String s2) {
		int c=0;
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					c++;
				}
			}
			if(c==0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
