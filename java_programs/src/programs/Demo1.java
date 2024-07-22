package programs;



public class Demo1 {

	public static void main(String[] args) {
		int[] c= {2,3,5,4};
		try {
			//System.out.println(div(25,5));
			System.out.println(even(5));
			
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(c[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static int div(int a,int b) throws Exception{
		
		return a/b;
	}
	public static int even(int a) throws MyException {
		if(a%2!=0) {
			throw new MyException("please enter only even numbers");
		}
		return a;
		
	}
}
