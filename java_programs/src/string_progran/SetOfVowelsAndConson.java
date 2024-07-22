package string_progran;

import java.util.Scanner;

//program to accept a name and separate vowels set and consonant set
public class SetOfVowelsAndConson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String vol="",con="";
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
        		vol+=str.charAt(i);
        	}
        	else {
        		if(str.charAt(i)!=' ')
        			con+=str.charAt(i);
        	}
        }
        System.out.println("the vowels are {"+vol+"}");
        System.out.println("the consonant are {"+con+"}");
	}
}
