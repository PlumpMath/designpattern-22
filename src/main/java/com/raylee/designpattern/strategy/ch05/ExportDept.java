package com.raylee.designpattern.strategy.ch05;

public class ExportDept implements Export {

	public void exportObject() {
		exportDept();
	}

	private void exportDept() {
		System.out.println("export depts");
	}

}
