package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		while(!name.equals(" ")) {
			System.out.println("Enter name :");
			name = b.readLine();
			System.out.println(name);
		}
		System.out.println("Ended !");
		b.close();
	}

}
