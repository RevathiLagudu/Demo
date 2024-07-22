package java_programs;
//Implement simple calculator program using switch

public class Calculator {
	public static void main(String[] args) {
		double num1=10.0;
		double num2=5.0;
		char operator='/';
		switch(operator){
			case '+':
				System.out.println(num1+num2);
				break;
			
			case '-':
				System.out.println(num1-num2);
				break;
			
			case '*':
				System.out.println(num1*num2);
				break;
			
			case '/':
				System.out.println(num1/num2);
				break;
			
		default:
			System.out.println("invalied operator");
		
		}
	}
}
