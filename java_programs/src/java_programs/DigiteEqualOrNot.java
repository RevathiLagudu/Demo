package java_programs;

public class DigiteEqualOrNot {

	public static void main(String[] args) {
		int n=45;
		int c=0,c1=0;
		int d=n%10;
		while(n!=0) {
			int r=n%10;
			c++;
			n=n/10;
			if(r==d) {
				c1++;
		
			}
		}
		if(c==c1)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}
