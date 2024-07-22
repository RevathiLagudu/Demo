package java_programs;
//Print even numbers up to n using switch. 
public class EvenNumSwitch {
	public static void main(String[] args) {
		int n=100;
		for(int i=1;i<=n;i++)
		switch(i%2) {
		case 0:
			System.out.println(i+"even number");
			break;
		default:
			break;
		}
	}
}
