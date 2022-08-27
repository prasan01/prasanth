package org.set;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetList {
	public static void main(String[] args) {
		
	Set s = new LinkedHashSet();
	
	
	
	s.add(10);
	s.add("java");
	s.add('c');
	s.add(1234567890L);
	s.add(44.33);
	s.add(true);
	s.add(null);
	s.add(10);
	s.add(null);
	
	System.out.println(s);
	
	}

}
