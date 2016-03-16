package com.raylee.designpattern.strategy.ch04;

/**
 * @TODO 1 用于部门的增删改查
 * @TODO 1.1 增加导入导出功能
 * @author raylee
 * @date 2016年3月16日
 * @version 1.1
 */
public class DeptServiceImpl extends BaseServiceImpl {
	public void exportDept() {
		getExportObject().exportDept();
	}

	public void importDept() {
		getImportObject().importDept();
	}
}
