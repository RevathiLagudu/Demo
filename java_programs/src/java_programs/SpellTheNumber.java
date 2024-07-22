package java_programs;
//Spell the number in form of words related to digits. ( Ex: 786  seven eight six)
public class SpellTheNumber {
	public static void main(String[] args) {
		int n=786;
		int rev=0;
		while(n>0) {
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
		}
		while(rev>0) {
			int rem=rev%10;
			
		switch(rem) {
		case 0:
			System.out.print(" zero");
			break;
		case 1:
			System.out.print(" one");
			break;
		case 2:
			System.out.print(" two");
			break;
		case 3:
			System.out.print(" three");
			break;
		case 4:
			System.out.print(" four");
			break;
		case 5:
			System.out.print(" five");
			break;
		case 6:
			System.out.print(" six");
			break;
		case 7:
			System.out.print(" seven");
			break;
		case 8:
			System.out.print(" eight");
			break;
		case 9:
			System.out.print(" nine");
			break;
		
		default:
			System.out.print("not a number");
		}
		rev=rev/10;
		
		}
		
		
	}
}
