package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingImp {
	public static void main(String[] args) {
		File abc= new File("C:/Users/Unnamalai.S/Desktop/file.txt");
		try {
			abc.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//abc.delete();
		//abc.mkdir();
		//boolean a = abc.exists();
		//System.out.println(a);

	}

}
