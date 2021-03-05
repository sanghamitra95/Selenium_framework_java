package config;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop=new Properties();
	static String projPath=System.getProperty("user.dir");
	public static void main(String[] args) throws IOException
	{
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() 
	{
		try {
		Properties prop=new Properties();
		String projPath=System.getProperty("user.dir");
		InputStream file=new FileInputStream(projPath+"\\src\\test\\java\\config\\config.properties");
		prop.load(file);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties() throws IOException
	{
		OutputStream output=new FileOutputStream(projPath+"\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, "The output is stored in properties file");
	}
}

