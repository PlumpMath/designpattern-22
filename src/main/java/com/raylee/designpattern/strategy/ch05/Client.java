package com.raylee.designpattern.strategy.ch05;

public class Client {
	// 对用户、部门、课程进行增删改查
	public static void main(String[] args) {
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl();
		courseServiceImpl.setExportObject(new ExportCourse());
		courseServiceImpl.setImportObject(new ImportUser());
		courseServiceImpl.importObject();
		courseServiceImpl.exportObject();
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setExportObject(new ExportUser());
		userServiceImpl.setImportObject(new ImportUser());
		userServiceImpl.importObject();
		userServiceImpl.exportObject();
		DeptServiceImpl deptServiceImpl = new DeptServiceImpl();
		deptServiceImpl.setExportObject(new ExportDept());
		deptServiceImpl.setImportObject(new ImportDept());
		deptServiceImpl.importObject();
		deptServiceImpl.exportObject();
	}
}
