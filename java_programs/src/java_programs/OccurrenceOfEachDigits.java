 package java_programs;
//Print occurrence(how many times each digit is repeated) of each digit in the given number
public class OccurrenceOfEachDigits {

	public static void main(String[] args) {
		int n=1274124;
		int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
//		n=Math.abs(n);
		while(n>0) {
			int r=n%10;
			if(r==0)c++; 
			else if(r==1)c1++;
			else if(r==2)c2++;
			else if(r==3)c3++;
			else if(r==4)c4++;
			else if(r==5)c5++;
			else if(r==6)c6++;
			else if(r==7)c7++;
			else if(r==8)c8++;
			else if(r==9)c9++;
			
			n=n/10;
		}
		if(c>0) 
			System.out.println("digit0:"+c);
		if(c1>0) 
		System.out.println("digit1:"+c1);
		if(c2>0) 
		System.out.println("digit2:"+c2);
		if(c3>0) 
		System.out.println("digit3:"+c3);
		if(c4>0) 
		System.out.println("digit4:"+c4);
		if(c5>0) 
		System.out.println("digit5:"+c5);
		if(c6>0) 
		System.out.println("digit6:"+c6);
		if(c7>0) 
		System.out.println("digit7:"+c7);
		if(c8>0) 
		System.out.println("digit8:"+c8);
		if(c9>0) 
		System.out.println("digit:"+c9);
	}
}
