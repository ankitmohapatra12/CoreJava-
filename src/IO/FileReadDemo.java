package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("D:\\SpringbootProjects\\CORE-JAVA-PROGRAMS\\Sample.txt");
			int val;
			while((val = fin.read())!=-1) {
				System.out.print((char)val);
			}
			fin.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
