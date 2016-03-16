package com.raylee.designpattern.strategy.ch02;

public class Client {
	// 对用户、部门、课程进行增删改查
	public static void main(String[] args) {
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl();
		courseServiceImpl.importObjects();
		courseServiceImpl.exportObjects();
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.importObjects();
		userServiceImpl.exportObjects();
		DeptServiceImpl deptServiceImpl = new DeptServiceImpl();
		deptServiceImpl.importObjects();
		deptServiceImpl.exportObjects();
	}
}
