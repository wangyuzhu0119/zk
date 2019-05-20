package com.wangyuzhu.common.utils;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void test() {
		String FilePath = FileUtil.getFilePath();
		System.out.println(FilePath);
		
		String UserPath = FileUtil.getUserPath();
		System.out.println(UserPath);
		
		String ClassPath = FileUtil.getClassPath();
		System.out.println(ClassPath);
	}

}
