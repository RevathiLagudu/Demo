package string_progran;

import java.util.Scanner;

//program to count the number of vowels and consonants in a given string
public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
	
		int vc=0,cc=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='Z') {
				vc++;
			}
			else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				cc++;
			}
			else {
				ch=' ';
				ch=0;
			}
			
		}
		System.out.println(" no of vowels:"+vc);
		System.out.println("no of consonants"+cc);
	}
}
