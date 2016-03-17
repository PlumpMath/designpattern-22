package com.raylee.designpattern.strategy.ch05;

public class ImportCourse implements Import {

	public void importObject() {
		importCourse();
	}

	private void importCourse() {
		System.out.println("import courses");
	}

}
