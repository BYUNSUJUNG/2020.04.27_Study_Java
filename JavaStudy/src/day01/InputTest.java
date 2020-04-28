package day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException  {
		File f = new  File("boxOffice.txt");
		FileInputStream input = new FileInputStream(f);
		StringBuffer buffer = new StringBuffer();
		
		int data = 0;
		
//		first
//		while((data = input.read())  !=  -1) {
//			System.out.write(data);
//		}
		
// second
		byte[] b = new byte[4096];
		while((data = input.read(b)) != -1) {
			buffer.append(new String(b,0,data));
		}
		String str = buffer.toString();
		System.out.println(str);

	}

}
