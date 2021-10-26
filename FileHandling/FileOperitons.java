import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperitons {
	public static boolean writeByteStreamToFile(String path,byte[] string)throws IOException{
		FileOutputStream file = new FileOutputStream(path);
		try {
			file.write(string);
			return true;
		}catch (Exception e) {
			return false;
		}
		finally {
			file.close();
		}
	}
	
	public static boolean writeIntegerToFile(String path,int data)throws IOException{
		FileOutputStream file = new FileOutputStream(path);
		try {
			
			file.write(data);
			return true;
		}catch (Exception e) {
			return false;
		}
		finally {
			file.close();
		}
	}
	
	public static String readFromFile(String path) throws FileNotFoundException {
		String data="";
		FileInputStream file = new FileInputStream(path);
		try{
			int i = 0;
			while((i=file.read())!=-1) {
				data+=(char)i;
			}
			return data;
		}catch (Exception e) {
			return null;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		boolean result=writeByteStreamToFile("test.txt","Hello java".getBytes());
		System.out.println(result?"Success":"Failed");
		result=writeIntegerToFile("integer.txt",69);
		System.out.println(result?"Success":"Failed");
		System.out.println(readFromFile("test.txt"));
		
	}
}
