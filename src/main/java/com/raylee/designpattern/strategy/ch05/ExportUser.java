package com.raylee.designpattern.strategy.ch05;

public class ExportUser implements Export {

	public void exportObject() {
		exportUser();
	}

	private void exportUser() {
		System.out.println("export users");
	}

}
