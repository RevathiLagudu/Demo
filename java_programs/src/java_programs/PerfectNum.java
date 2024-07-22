package java_programs;
//Given number is perfect number or not 

public class PerfectNum {

	public static void main(String[] args) {
		int n=6,s=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) 
				s=s+i;
			
		}
			if(s==n) {
				System.out.println("perfect number");
			}
			else {
				System.out.println("not a perfect number");
			}
	}
}
