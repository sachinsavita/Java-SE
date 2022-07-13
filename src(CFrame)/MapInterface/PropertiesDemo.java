package MapInterface;

import java.io.*;
import java.util.*;


//Create or read the file
public class PropertiesDemo {// Subclass of HashTable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties p = new Properties();

		p.setProperty("Brand", "Dell");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "Windows10");
		p.setProperty("Model", "Latitude");

//		try {
//			p.store(new FileOutputStream("/Users/Sachin/Documents/MyData.xml"), "Laptop");//It will generate the file
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Reading the file here which made previousley");
		
		
			try {
				p.loadFromXML(new FileInputStream("/Users/Sachin/Documents/MyData.xml") );
			} catch (InvalidPropertiesFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println(p);
	}

}
