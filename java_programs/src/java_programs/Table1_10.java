package java_programs;
//Program to print multiplication tables from 1 to 10 up to 12. 

public class Table1_10 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
		    for(int j=1;j<=12;j++)
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}
