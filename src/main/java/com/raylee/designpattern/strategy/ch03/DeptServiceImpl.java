package com.raylee.designpattern.strategy.ch03;

/**
 * @TODO 1 ���ڲ��ŵ���ɾ�Ĳ�
 * @TODO 1.1 ���ӵ��뵼������
 * 
 * @author raylee
 * @date 2016��3��16��
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
