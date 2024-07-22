package string_progran;

import java.util.Scanner;

//program to print no of words and consonants in a given string
public class WordAndCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int cc=0 ,c=0;
		for(int i=0;i<str.length();i++) {
				c++;
		}
		
			for(int i=0;i<str.length()-1;i++) {
				 if(str.charAt(i)==' ')  {  
					 cc++;
				}
			}
			
			System.out.println("no of letters"+c);
			System.out.println("no of words"+cc);
		
	}
}
