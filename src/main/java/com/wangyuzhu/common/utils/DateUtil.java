package com.wangyuzhu.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	//�³�
	public static Date getStartMonth(String date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = getCalendar(date);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		Date time = c1.getTime();
		return time;
	}
	
	
	//��ĩ
	public static Date getEndMonth(String date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = getCalendar(date);
		c1.add(Calendar.MONTH, 1);
		c1.set(Calendar.DAY_OF_MONTH, 0);
		Date time = c1.getTime();
		return time;
	}
	
	
	//�³�����ĩ��ͬ���õķ���
	private static Calendar getCalendar(String date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		if(null != date && date.length()>0 ) {
			try {
				Date date2 = df.parse(date);
				c1.setTime(date2);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return c1;
	}
	
}
