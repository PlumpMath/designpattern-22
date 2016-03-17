package com.raylee.designpattern.strategy.ch04;

public class Client {
	// 对用户、部门、课程进行增删改查
		public static void main(String[] args) {
			CourseServiceImpl courseServiceImpl = new CourseServiceImpl();
			courseServiceImpl.importCourse();
			courseServiceImpl.exportCourse();
			UserServiceImpl userServiceImpl = new UserServiceImpl();
			userServiceImpl.importUser();
			userServiceImpl.exportUser();
			DeptServiceImpl deptServiceImpl = new DeptServiceImpl();
			deptServiceImpl.importDept();
			deptServiceImpl.exportDept();
		}
}
