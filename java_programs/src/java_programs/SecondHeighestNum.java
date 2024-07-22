package java_programs;
//Program to find the second highest digit in the given number
public class SecondHeighestNum {

	public static void main(String[] args) {               
		int n=4569;
		int temp=n,rem=0;
		int b1=0,b2=0;
		while(n>0) {
			rem=n%10;
			if(rem>b1) {
				b1=rem;
			}
				n=n/10;
			}
		while(temp>0) {
			rem=temp%10;
			if(rem!=b1 && rem>b2) {
				b2=rem;
			}
			temp=temp/10;
		}
		System.out.println("first highest"+b1+"and"+b2+"second highest");
	}
}
