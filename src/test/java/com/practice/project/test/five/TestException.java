package com.practice.project.test.five;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestException {

	@Test
	public void testClassNotFound() throws Exception {
		try {
			Class<?> cls = Class.forName("com.mosy.test");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testArray() throws Exception {
		try {
			String[] str = new String[-5];
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testList() throws Exception {
		try {
			List<String> list = new ArrayList<String>();
			System.out.println(list.get(10000000));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testFileNotFound() throws Exception {
		InputStream in = null;
		try {
			File file = new File("D://test/txt");
			in = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	}

	@Test
	public void testNullPointer() throws Exception {
		String name = null;
		try {
			int i = name.length();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testOutOfMemory() throws Exception {
		try {
			while (true) {
				String[] str = new String[500000000];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
