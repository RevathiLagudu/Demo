package java_programs;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(add(4,6));
		String s="welcome";
		String s1="welcome";
		s=s.concat("home");
		String s3=new String("welcome").intern();
		//System.out.println(s1);
		//System.out.println(s==s1);
		//System.out.println(s.equals(s1));
		
		StringBuffer sb= new StringBuffer("welcome");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
  static int add(int a,int b) {
	return (a+b);
}
}
