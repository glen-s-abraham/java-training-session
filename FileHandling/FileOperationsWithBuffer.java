import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperationsWithBuffer {
	public static void main(String[] args) throws IOException {	
		
		FileOutputStream fileWrite = new FileOutputStream("test.txt");
		BufferedOutputStream bufferWrite = new BufferedOutputStream(fileWrite);
		bufferWrite.write("Hellow world".getBytes());
		bufferWrite.close();
		fileWrite.close();
		System.out.println("Wrote to file");
		
		FileInputStream fileRead = new FileInputStream("test.txt");
		BufferedInputStream bufferRead = new BufferedInputStream(fileRead);
		int i = 0;
		while((i=bufferRead.read())!=-1)
			System.out.print((char)i);
		bufferRead.close();
		fileRead.close();
		
	}
}
