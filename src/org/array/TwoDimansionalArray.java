package org.array;

public class TwoDimansionalArray {
	
	public static void main(String[] args) {
		
		//datatype variyable[][]=new datatype[size][size]
		
		int a[][]= new int [3][5];
		
		a[0][0] = 10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[0][4]=50;
		
		a[1][0]=60;
		a[1][1]=70;
		a[1][2]=80;
		a[1][3]=90;
		a[1][4]=100;
		
		a[2][0]=11;
		a[2][1]=22;
		a[2][2]=33;
		a[2][3]=44;
		a[2][4]=55;
		
		//print the value
		System.out.println(a[0][2]);
		
		//print all value 
		System.out.println("nested for loop"+"\n"+"****************");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				
				System.out.println(a[i][j]);
				
			}
			
		}
			
			//neste enhaced for loop or for each loop
			System.out.println("neted for each loop"+"\n"+"**********************");
			
			for (int b[] : a) {
				for (int c : b) {
					
					System.out.println(c);
					
				}
				
			}
		
	}

}
