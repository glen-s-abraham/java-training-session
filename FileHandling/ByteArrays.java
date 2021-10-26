import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrays {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		FileOutputStream file1 = new FileOutputStream("file1.txt");
		FileOutputStream file2 = new FileOutputStream("file2.txt");
		byteOut.write(65);
		byteOut.writeTo(file1);
		byteOut.writeTo(file2);
		System.out.println("Success!");
		
		byte[] buf = { 35, 36, 37, 38 }; 
		ByteArrayInputStream byteIn = new ByteArrayInputStream(buf);
		int i = 0;
		while((i=byteIn.read())!=-1)
			System.out.println((char)i);
		
	}

}
