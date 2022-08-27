package com.samepackage;
//child class 
public class StateDetails {
	private void southIndia() {
		System.out.println("tamil nadu"); 
	}
	private void  northIndia() {
		System.out.println("delhi"+"\n");
	}
	public static void main(String[] args) {
		StateDetails st = new StateDetails();
		LanguageInfo lang = new LanguageInfo();
		st.southIndia();
		st.northIndia();
		lang.tamilLanguage();
		lang.hindiLanguage();
	}

}
