package com.wangyuzhu.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtil {

	public static void closeAll(String file) {
		
	}
	
	public static String readTextFile(InputStream src){
		return null;
	}
	
	public static String readTextFile(File txtFile){
		return null;
	}
	
	
	//获取文件内容写入文件
	public static void readAndWriteFile(File srcFile,File destFile){
		FileInputStream fileInputStream = null;
	    InputStreamReader inputStreamReader = null;
	    BufferedWriter bufferedWriter = null;
	    BufferedReader bufferedReader = null;
	    FileWriter fileWriter = null;
	    try {
	    	fileInputStream = new FileInputStream(srcFile);
	        inputStreamReader = new InputStreamReader(fileInputStream);
	        bufferedReader = new BufferedReader(inputStreamReader);
	        fileWriter = new FileWriter(destFile);
	        bufferedWriter = new BufferedWriter(fileWriter);
	        String data = null;
	        while ((data = bufferedReader.readLine()) != null){
	        	bufferedWriter.write(data);
	            bufferedWriter.newLine();
	            bufferedWriter.flush();
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    	}
	    }
}
