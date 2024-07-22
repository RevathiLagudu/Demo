package java_programs;
//Program to print the no of occurrences of a target digit in a number. (Ex:  7678  if target digit is 7 then 7 is repeated two times)
public class Occurrences {

	public static void main(String[] args) {
		int n=57867;
		int rem=0;
		int c=0;
		int tg=7;
		while(c<n) {
			rem=n%10;
			if(rem==tg) {
				c++;
			}
			n=n/10;
			
		}
			System.out.println(tg+":is present in "+c+" times");
	}
}
