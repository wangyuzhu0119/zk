package com.wangyuzhu.common.utils;

public class FileUtil {
	
	//��ʱĿ¼
	public static String getFilePath() {
		String FilePath = System.getProperty("java.io.tmpdir");
		return FilePath;
	}
	
	//�û�Ŀ¼
	public static String getUserPath() {
		String UserPath = System.getProperty("user.dir");
		return UserPath;
	}
	
	//���ļ�
	public static String getClassPath() {
		String ClassPath = System.getProperty("java.class.path");
		return ClassPath;
	}
}
