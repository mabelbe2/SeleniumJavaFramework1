package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {
	static Properties properties = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() {

		try {
			
			
			InputStream input = new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			
			properties.load(input);
			String browserString = properties.getProperty("browser");
			System.out.println(browserString);
			TestNG_Demo.browsername = properties.getProperty("browser");
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			properties.setProperty("result", "pass");
			properties.store(output, null);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}

}
