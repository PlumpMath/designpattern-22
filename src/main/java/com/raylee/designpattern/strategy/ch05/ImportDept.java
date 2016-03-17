package com.raylee.designpattern.strategy.ch05;

public class ImportDept implements Import {

	public void importObject() {
		importDept();
	}

	private void importDept() {
		System.out.println("import depts");
	}

}
