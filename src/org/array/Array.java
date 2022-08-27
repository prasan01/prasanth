package org.array;

public class Array {
	public static void main(String[] args) {
		
		//datatype   variable[] = new datatype[size]
		
		int a[] = new int[5];
		
		//insert a value in array
		a[0]= 10;
		
		a[1]=20;
		
		a[2]=30;
		
		a[3]=40;
		
		a[4]=30;
		
		//print the value
		System.out.println(a[3]);
		
		//to print all value
		System.out.println("for loop"+"\n"+"*********");
		
		for (int i = 0; i <5; i++) {
			
			System.out.println(a[i]);
			
		}
		//enhaced for loop or for each loop
		System.out.println("for ech loop"+"\n"+"**********");
		
		for (int b : a) {
			
			System.out.println(b);
			
		}
		
		
	}

}
