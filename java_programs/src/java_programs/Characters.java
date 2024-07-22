package java_programs;
//Print characters from a to z 
public class Characters {

	public static void main(String[] args) {
		char ch='a';
		for(int i=1;i<=26;i++) {//while(ch<='z')
			System.out.print(ch+" ");
			ch++;
		}
	}
}
