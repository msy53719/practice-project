package com.practice.project.six;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;

public class MapTask {

	// private static final DateTimeFormatter DTF=DateTimeFormatter.;
	private SimpleDateFormat Ddmp = new SimpleDateFormat("YYYY-MM-dd HH:mm:ssss");
	private Map<String, String> hmap = new HashMap<String, String>();
	private Map<String, String> htab = new Hashtable<String, String>();
	private Map<String, String> currmap = new ConcurrentHashMap<String, String>();
	private Map<String, String> treemap = new TreeMap<String, String>();

	@Test
	public void TestHmap() {
		System.out.println("hmap 开始....:" + Ddmp.format(new Date()));
		for (int i = 0; i < 11000000; i++) {
			hmap.put(String.valueOf(i), String.valueOf(i).concat("test"));
		}
		System.out.println("hmap 完成....:" + Ddmp.format(new Date()));
	}
	@Test
	public void TestHtable() {
		System.out.println("htab 开始....:" + Ddmp.format(new Date()));
		for (int i = 0; i < 11000000; i++) {
			htab.put(String.valueOf(i), String.valueOf(i).concat("test"));
		}
		System.out.println("htab 完成....:" + Ddmp.format(new Date()));
	}
	
	@Test
	public void TestCurrmap() {
		System.out.println("currmap 开始....:" + Ddmp.format(new Date()));
		for (int i = 0; i < 11000000; i++) {
			currmap.put(String.valueOf(i), String.valueOf(i).concat("test"));
		}
		System.out.println("currmap 完成....:" + Ddmp.format(new Date()));
	}
	
	@Test
	public void TestTreemap() {
		System.out.println("treemap 开始....:" + Ddmp.format(new Date()));
		for (int i = 0; i < 11000000; i++) {
			treemap.put(String.valueOf(i), String.valueOf(i).concat("test"));
		}
		System.out.println("treemap 完成....:" + Ddmp.format(new Date()));
	}
}
