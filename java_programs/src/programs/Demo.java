package programs;
//Instance Initilizer Block
public class Demo {

//	 static{
//		System.out.println("FSIB");
//		System.out.println("helloo");
//	}
//	{
//		System.out.println("from IIB");
//	}
//	public static void main(String[] args) {
//		Demo obj=new Demo();
//		Demo obj1=new Demo();
//	}
//	
	int i=10;
	static Demo obj;
	public static void main(String[] args) {
		System.out.println("hello......!");
		try {
		System.out.println(obj.i);
		}
		catch(Exception e) {
			System.out.println("null pointer");
		}
		System.out.println("java........!");
	}
}
