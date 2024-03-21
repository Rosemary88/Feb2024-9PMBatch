package oops;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class FileHandling 
{
	
	
	public static void readProp() throws Exception
	{
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("programmingLang"));
		System.out.println(prop.get("url"));
	}

	public static void readData() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");  //file connection
	//	File f = new File("./TestData/xyz.txt");
		
		FileReader fr = new FileReader("./TestData/xyz.txt");
		
		int r = fr.read();  //116
		
		while(r!=-1)
		{
			System.out.print((char)r);  ///th
			r=fr.read(); 
		}
		}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/abc.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nThis is forth line of the file");
		fw.flush();
		fw.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		//FileHandling.readData();
		FileHandling.writedata();
		FileHandling.readProp();
	}
	
}
