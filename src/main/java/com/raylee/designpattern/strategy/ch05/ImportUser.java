package com.raylee.designpattern.strategy.ch05;

public class ImportUser implements Import {

	public void importObject() {
		importUser();
	}

	private void importUser() {
		System.out.println("import users");
	}

}
