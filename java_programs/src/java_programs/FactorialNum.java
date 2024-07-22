package java_programs;
//Print factorial of n. 

public class FactorialNum {

	public static void main(String[] args) {
		int n=5;
		int fat=1;
		for(int i=1;i<=n;i++) {
			fat*=i;
//			System.out.println(fat);
		}
		System.out.println(fat);
	}
}
