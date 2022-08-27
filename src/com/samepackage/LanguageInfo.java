package com.samepackage;
//parent class
public class LanguageInfo {
    public void tamilLanguage() {
    	System.out.println("tamil language speek in tamil nadu");
    }
    public void hindiLanguage() {
    	System.out.println("hindi speek in delhi");
    }
    public static void main(String[] args) {
    	LanguageInfo lang = new LanguageInfo();
    	lang.tamilLanguage();
    	lang.hindiLanguage();
    }
}
