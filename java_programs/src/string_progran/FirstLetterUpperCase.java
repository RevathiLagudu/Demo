package string_progran;
//programe to convert first letter of each word into uppercase letter in a given sentence
import java.util.Scanner;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String a="";
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(i==0 && ch>='a' && ch<='z'&&ch!=' ') {
        		a+=(char)(ch-32);
        	}
        	else if(ch==' '&&str.charAt(i+1)>='a'&&str.charAt(i+1)<='z'&&str.charAt(i+1)!=' ') {
        		ch=str.charAt(i+1);
        		a+=" "+(char)(ch-32);
        		i++;
        	}
        	else {
        		a+=ch;
        	}
        }
        System.out.println(a);
	} 
}
