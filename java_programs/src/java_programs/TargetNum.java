package java_programs;
//Program to check whether the target digit is presented in the number or not?

public class TargetNum {

	public static void main(String[] args) {
		int n=5786;
		int rem=0;
		int tg=7;
		boolean isthere=false;
		while(n>0) {
			rem=n%10;
			if(rem==tg) {
				isthere=true;
				break;
			}
			n=n/10;
		}
		if(isthere==true) 
			System.out.println(tg+"is there");
		else
			System.out.println(tg+"not there");
	}
}
