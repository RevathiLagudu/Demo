package string_progran;

import java.util.Scanner;

//program to delete n characters in a given string
public class NCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String n="";
        char ch='o';
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)==ch) {
        		n+="";
        	}
        	else {
        		n+=str.charAt(i);
        	}
        }
        System.out.println(n);
	}
}
