package com.wangyuzhu.common.utils;

import java.io.File;
import java.util.Set;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void test() {
		File srcFile =new File("F:\\abc.txt");
		File destFile =new File("G:\\abc.txt");
		Set<String> set = StreamUtil.readFile(srcFile);
		System.out.println(set);
	}

}
