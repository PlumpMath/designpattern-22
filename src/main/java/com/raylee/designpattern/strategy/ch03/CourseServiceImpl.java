package com.raylee.designpattern.strategy.ch03;

/**
 * @TODO 1.用于课程的增删改查
 * @TODO 1.1 增加导入导出功能
 * 
 * @author raylee
 * @date 2016年3月16日
 * @version 1.1
 */
public class CourseServiceImpl extends BaseServiceImpl implements ExportService, ImportService {

	public void importObjects() {
		System.out.println("import courses");
	}

	public void exportObjects() {
		System.out.println("export courses");
	}

}
