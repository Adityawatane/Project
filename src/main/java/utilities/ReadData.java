package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{

	public static String readPropertiesFile(String value) throws IOException {
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("E:\\NTC\\Eclipse\\Maven\\src\\main\\java\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
}
