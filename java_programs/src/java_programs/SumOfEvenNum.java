package java_programs;
//Print sum of all even numbers  b/w 1 to n 
public class SumOfEvenNum {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) 
				sum=sum+i;
		}
		System.out.println(sum);
	}
}