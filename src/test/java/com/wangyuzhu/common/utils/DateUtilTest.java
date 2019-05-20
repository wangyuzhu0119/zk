package com.wangyuzhu.common.utils;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Date start = DateUtil.getStartMonth("2018-05-20");
		System.out.println(start);
		
		Date end = DateUtil.getEndMonth("2018-05-20");
		System.out.println(end);
	}

}
