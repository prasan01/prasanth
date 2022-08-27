package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DoubleList {
	public static void main(String[] args) {
		
	List li = new ArrayList();
		
		li.add(10);
		li.add("java");
		li.add('c');
		li.add(1234567890L);
		li.add(44.33);
		li.add(true);
		li.add(null);
		
		System.out.println(li);
		
		List l = new LinkedList();
		System.out.println(l);
		
		l.addAll(li);
		l.add("maven");
		
		System.out.println(l);
		
		//retainall
		l.retainAll(li);
		System.out.println(l);
		
		l.removeAll(li);
		System.out.println(l);
		
		System.out.println("for loop:"+"\n"+"***********");
		for (int i = 0; i < li.size(); i++) {
			Object object = li.get(i);
			System.out.println(object);
		}
		
		System.out.println("enhaced for loop:"+"\n"+"**************");
		for (Object s : li) {
			System.out.println(s);
			
		}
	}

}
