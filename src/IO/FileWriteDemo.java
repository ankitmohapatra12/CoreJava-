package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout;
		FileInputStream fin;
		try {
			fout = new FileOutputStream("D:\\\\SpringbootProjects\\\\CORE-JAVA-PROGRAMS\\\\Sample.txt");
			fin = new FileInputStream("D:\\\\SpringbootProjects\\\\CORE-JAVA-PROGRAMS\\\\Sample.txt");
			byte byteArry[] = {'A','N','K','I','T',' ','5'};
			for(byte b : byteArry) {
				fout.write(b);
			}
			//READING THE FILE TO CHECK IF THE OUTPUTSTREAM WORKED
			int val;
			while((val = fin.read())!=-1) {
				System.out.print((char)val);
			}
			fout.close();
			fin.close();
		}catch (Exception e) {
			System.out.println("Some IO exception occured !");
		}
	}

}
