package org.list;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		
		li.add(10);
		li.add("java");
		li.add('c');
		li.add(1234567890L);
		li.add(44.33);
		li.add(true);
		li.add(null);
		li.add(10);
		
		System.out.println(li);
		
		//size 
		int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		li.add(2, 'd');
		System.out.println(li);
		
		li.set(6, false);
		System.out.println(li);
		
		Object object = li.get(1);
		System.out.println(object);
		
		li.remove(4);
		System.out.println(li);
		
		boolean contains = li.contains("maven");
		System.out.println(contains);
		
		li.clear();
		System.out.println(li);
	}

}
