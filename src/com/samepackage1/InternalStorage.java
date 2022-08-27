package com.samepackage1;
// same package
public class InternalStorage {
	private void processerName() {
	  System.out.println("rom");

	}
	private void ramSize() {
		System.out.println("6gb");

	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage st = new ExternalStorage();
		i.processerName();
		i.ramSize();
		st.size();
	}

}
