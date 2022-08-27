package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListString {
	public static void main(String[] args) {
		
	List li = new ArrayList();
		
		li.add("maven");
		li.add("java");
		li.add("framewoek");
		li.add("selenium");
		
		System.out.println(li);
		
		Object object = li.get(1);
		System.out.println(object);
		
		for (Object v : li) {
			System.out.println(v);
			
		}
	}

}
