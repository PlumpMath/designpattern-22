package com.raylee.designpattern.strategy.ch04;

/**
 * @TODO 1 ���ڲ��ŵ���ɾ�Ĳ�
 * @TODO 1.1 ���ӵ��뵼������
 * @author raylee
 * @date 2016��3��16��
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
