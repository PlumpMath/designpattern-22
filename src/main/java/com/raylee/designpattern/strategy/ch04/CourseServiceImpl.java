package com.raylee.designpattern.strategy.ch04;

/**
 * @TODO 1 ���ڿγ̵���ɾ�Ĳ�
 * @TODO 1.1 ���ӵ��뵼������
 * 
 * @author raylee
 * @date 2016��3��16��
 * @version 1.1
 */
public class CourseServiceImpl extends BaseServiceImpl {
	public void exportCourse() {
		getExportObject().exportCourse();
	}

	public void importCourse() {
		getImportObject().importCourse();
	}
}
