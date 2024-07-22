package string_progran;
//programe to reverse the string without using predefined function for reverse
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String res=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			res=ch+res;
		}
		System.out.println(res);
	}
}
