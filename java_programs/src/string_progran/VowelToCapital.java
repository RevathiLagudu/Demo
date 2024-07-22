package string_progran;

import java.util.Scanner;

//program to accept a name and translate every vowel to capital vowel
public class VowelToCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String sir1=" ";
		for(int i=0;i<str.length();i++) {
			sir1=str.toLowerCase();
			char ch=sir1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(Character.toUpperCase(ch));
			}
			else {
				System.out.print(ch);
			}
			
		}

	}
}
