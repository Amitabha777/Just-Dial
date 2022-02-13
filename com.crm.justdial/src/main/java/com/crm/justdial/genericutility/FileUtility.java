package com.crm.justdial.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author AMITABHA
 *
 */
public class FileUtility {

	/**
	 * Used to get Properties Value according to Keys from 'commondata.properties' file 
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	
	public String propertyKeyValue(String Key) throws IOException
	{
		//Get Java Representation of Physical File
		FileInputStream fis= new FileInputStream("./Data/commondata.properties");
		
		//Create Object of Properties Class to load properties from Physical File
		Properties pObj= new Properties();
		pObj.load(fis);
		
		//Get the desired Value by Giving the desired Key
		return pObj.getProperty(Key);
		
	}
}
