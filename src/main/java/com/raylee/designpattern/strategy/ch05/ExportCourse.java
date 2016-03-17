package com.raylee.designpattern.strategy.ch05;

public class ExportCourse implements Export {

	public void exportObject() {
		exportCourse();
	}

	private void exportCourse() {
		System.out.println("export courses");
	}

}
