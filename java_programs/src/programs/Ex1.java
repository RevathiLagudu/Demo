package programs;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) throws Exception  {
		walk();
		classnotfound();
	}
	public static void classnotfound() throws ClassNotFoundException {
		Class.forName("523");
	}
//	public static void run() throws IOException {
//		walk();
//	}
	public static void walk() throws IOException {
//		FileOutputStream f=new FileOutputStream("C:\\Users\\Revathi Lagudu\\Desktop\\New folderjava");
		FileReader f=new FileReader("C:\\Users\\Revathi Lagudu\\Documents\\sis.txt");
		System.out.println("hello...!");
	}
}
