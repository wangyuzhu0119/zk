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
import java.util.HashSet;
import java.util.Set;

public class StreamUtil {

	public static void closeAll(String file) {
		
	}
	
	public static String readTextFile(InputStream src){
		return null;
	}
	
	
	//获取内容写入文件
    public static  Set<String> readFile(File srcFile){
    	
    	Set<String> set = new HashSet<>();
    	  FileInputStream fileInputStream = null;
          InputStreamReader inputStreamReader = null;
          BufferedReader bufferedReader = null;
          FileWriter fileWriter = null;
          BufferedWriter bufferedWriter = null;
          try {
              fileInputStream = new FileInputStream(srcFile);
              inputStreamReader = new InputStreamReader(fileInputStream);
              bufferedReader = new BufferedReader(inputStreamReader);
         
              String data = null;
              while ((data = bufferedReader.readLine()) != null){
            	  set.add(data);
              }
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }	
          
          return set;
    }
	
}
