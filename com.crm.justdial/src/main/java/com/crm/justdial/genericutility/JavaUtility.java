package com.crm.justdial.genericutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	/**
	 * To Generate Random Numbers
	 * @return
	 */
	public int getrandomNumber()
	{
		Random random= new Random();
		int ran=random.nextInt(1000);
		return ran;
	}
	
	
	/**
	 * To Get Date in The Format of DD-MMM-YYYY
	 * @return
	 */
	public String dateInFormatDDMMMYYYY()
	{
		Calendar cal= Calendar.getInstance();
		Date date=cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat("DD-MMM-YYY");
		String reqDate=sdf.format(date);
		return reqDate;
	}
	
	
	
}
