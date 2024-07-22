package string_progran;

import java.util.Scanner;
//Program to find length of the string without using predefined function for finding length.
public class LengthOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  string: ");
        String str = sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++) {
        	c++;
        }
        System.out.println("length of the string is : "+c);
	}
}
