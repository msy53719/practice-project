package com.practice.project.three;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StudentScore {

	public static Map<String, Double> getAllAvg(Student[] stu) {//平均成绩存入map
		Map<String, Double> stumap = new HashMap<>();// 计算所有人的平均成绩存放map
		DecimalFormat df = new DecimalFormat("#.00");// 格式化两位小数
		if (null == stu)
			return null;
		for (int i = 0; i < stu.length; i++) {
			double stuAvg = (stu[i].getChScore() + stu[i].getEnScore() + stu[i].getMathScore()) / 3;
			stumap.put(stu[i].getName(), Double.valueOf(df.format(stuAvg)));
		}
		return stumap;
	}

	public static void sortMap(Map<String, Double> map) {//从高到低排序
		List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
			@Override
			public int compare(Entry<String, Double> val1, Entry<String, Double> val2) {
				return val2.getValue().compareTo(val1.getValue());
			}
		});
		for (Map.Entry<String, Double> sortmap : list) {
			System.out.println("成绩由高到低"+"{"+sortmap.getKey() + ":" + sortmap.getValue()+"}");
		}

	}

	public static void getNotPass(Map<String, Double> map) {//获取不及格的平均成绩以及姓名
		for (Entry<String, Double> entry : map.entrySet()) {
			if (entry.getValue() < 60) {
				System.out.println("平均成绩不及格："+"{"+entry.getKey() + ":" + entry.getValue()+"}");
			}
		}
	}

	public static void  getMaxSocre(Map<String, Double> map) {//获取最高平均成绩以及姓名
		if (null != map);
		Collection<Double> set = map.values();
		Object[] obj = set.toArray();
		Arrays.sort(obj);
		for (Entry<String, Double> m : map.entrySet()) {
			if (m.getValue().equals(obj[obj.length - 1])) {
				String key = m.getKey();
				System.out.println("平均成绩排名第一:"+"{"+key + ":" + obj[obj.length - 1]+"}");
			}
		}
	}


	public static void main(String[] args) {
		Student[] stu = new Student[10];
		stu[0] = new Student("Name-a", 89, 98, 91);
		stu[1] = new Student("Name-b", 92, 60, 98);
		stu[2] = new Student("Name-c", 56, 50, 57);
		stu[3] = new Student("Name-d", 70, 84, 88);
		stu[4] = new Student("Name-e", 76, 83, 80);
		stu[5] = new Student("Name-f", 80, 80, 86);
		stu[6] = new Student("Name-g", 62, 53, 48);
		stu[7] = new Student("Name-h", 75, 90, 94);
		stu[8] = new Student("Name-i", 90, 68, 84);
		stu[9] = new Student("Name-j", 89, 69, 81);
		//getMaxSocre(getAllAvg(stu));
		//getNotPass(getAllAvg(stu));
		//sortMap(getAllAvg(stu));
        Map<String, Double> map=getAllAvg(stu);
        getMaxSocre(map);
        getNotPass(map);
        sortMap(map);
        
	}
}
