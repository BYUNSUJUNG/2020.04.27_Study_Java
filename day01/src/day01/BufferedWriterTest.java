package day01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		bw.write("의사");
		bw.newLine();
		bw.write("집배원\r\n");
		
		
		bw.write("가수\r\n");
		bw.write("강사\r\n");
		bw.close();
		String line = "";
		System.out.println(br.readLine());
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
