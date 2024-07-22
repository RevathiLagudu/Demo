package java_programs;
//Print multiplication table for a given number up to range 12.

public class Table {

	public static void main(String[] args) {
		int n=1,t=2;
		while(n<=12) {
			System.out.println(t+"*"+n+"="+t*n);
			n++;
		}
	}
}
