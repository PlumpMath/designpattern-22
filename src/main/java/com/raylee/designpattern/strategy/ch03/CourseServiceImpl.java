package com.raylee.designpattern.strategy.ch03;

/**
 * @TODO 1.���ڿγ̵���ɾ�Ĳ�
 * @TODO 1.1 ���ӵ��뵼������
 * 
 * @author raylee
 * @date 2016��3��16��
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
