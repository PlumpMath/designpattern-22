package com.raylee.designpattern.strategy.ch04;

/**
 * @TODO 1 �����û�����ɾ�Ĳ�
 * @TODO 1.1 ���ӵ��뵼������
 * @author raylee
 * @date 2016��3��16��
 * @version 1.1
 */
public class UserServiceImpl extends BaseServiceImpl {
	public void exportUser() {
		getExportObject().exportUser();
	}

	public void importUser() {
		getImportObject().importUser();
	}

}
