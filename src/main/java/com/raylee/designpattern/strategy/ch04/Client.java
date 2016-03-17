package com.raylee.designpattern.strategy.ch04;

public class Client {
	// ���û������š��γ̽�����ɾ�Ĳ�
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
