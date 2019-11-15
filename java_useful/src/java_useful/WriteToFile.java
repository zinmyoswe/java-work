package java_useful;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Tutorial2\\haha.txt");
			myWriter.write(" Java is top 2 programming language in 2019");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
	}
}
