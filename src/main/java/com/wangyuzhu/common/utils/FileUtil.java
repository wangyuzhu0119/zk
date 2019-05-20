package com.wangyuzhu.common.utils;

public class FileUtil {
	
	//临时目录
	public static String getFilePath() {
		String FilePath = System.getProperty("java.io.tmpdir");
		return FilePath;
	}
	
	//用户目录
	public static String getUserPath() {
		String UserPath = System.getProperty("user.dir");
		return UserPath;
	}
	
	//类文件
	public static String getClassPath() {
		String ClassPath = System.getProperty("java.class.path");
		return ClassPath;
	}
}
