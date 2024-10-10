package seleniumAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GeneralUtility
{	
	public String filePath; // null   
	
	public GeneralUtility(String path)
	{
		System.out.println("I got the file path :" + path);
		filePath = path;
	}
	
	public String readData(String input) throws IOException
	{
		FileInputStream file = new FileInputStream(filePath); //Like  News paper
		Properties myprop = new Properties(); // like news reader
		myprop.load(file);
		String output = myprop.getProperty(input);
		return output;
	}
	
	public String readData(String input,String filePath) throws IOException
	{
		FileInputStream file = new FileInputStream(filePath); //Like  News paper
		Properties myprop = new Properties(); // like news reader
		myprop.load(file);
		String output = myprop.getProperty(input);
		return output;
	}
	
}
