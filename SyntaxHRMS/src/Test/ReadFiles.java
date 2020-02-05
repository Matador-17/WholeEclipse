package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class ReadFiles {
	
	public static void main(String[] args) throws Exception {
		
		String path="./src/Test/configs.properties";
		
		File file=new File("C:\\Users\\ronal\\eclipse-workspace\\SyntaxHRMS\\src\\Test\\configs.properties");
		
		
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			System.out.println(prop.get("url"));
		

			Scanner fir=new Scanner(new File("./src/Test/data.txt"));
			while(fir.hasNextLine()) {
				String text =fir.nextLine();
				System.out.println(text);
			}
	
	
}}
