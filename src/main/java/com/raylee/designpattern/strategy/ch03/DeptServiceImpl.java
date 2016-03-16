package com.raylee.designpattern.strategy.ch03;

/**
 * @TODO 1 用于部门的增删改查
 * @TODO 1.1 增加导入导出功能
 * 
 * @author raylee
 * @date 2016年3月16日
 * @version 1.1
 */
public class DeptServiceImpl extends BaseServiceImpl implements ExportService, ImportService {
	public void importObjects() {
		System.out.println("import depts");
	}

	public void exportObjects() {
		System.out.println("export depts");
	}

}
