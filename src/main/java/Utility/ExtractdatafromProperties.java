package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExtractdatafromProperties 
{
	String key;
	public  static String properties(String key) throws IOException
	{
	
	Properties ps= new Properties();
	FileInputStream myfile=new FileInputStream("C:\\Users\\p_man\\eclipse-workspace\\NeostockMaven\\neostox.properties");
	ps.load(myfile);
	String value = ps.getProperty(key);
	return value ;
	}
}
