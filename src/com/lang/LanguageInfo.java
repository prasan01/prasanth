package com.lang; //same package
// child class 
public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("100");
	}
	private void hindiLanguage() {
		System.out.println("50");
	}
	public static void main(String[]args) {
		LanguageInfo c = new LanguageInfo();
		c.southIndia();
		c.northIndia();
		c.tamilLanguage();
		c.hindiLanguage();
		
		}

}
