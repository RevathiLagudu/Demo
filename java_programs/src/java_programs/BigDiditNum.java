package java_programs;
//Find big digit in a number
public class BigDiditNum {

	public static void main(String[] args) {
		int n=4569;
		int max=0;
		while(n>0) {
			int r=n%10;
			if(r>max) {
				max=r;
			}
			n/=10;
		}
		System.out.println(max+":this is big digit");
	}
}
