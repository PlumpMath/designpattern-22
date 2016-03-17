package com.raylee.designpattern.strategy.ch05;

/**
 * 1.0 �������������Ҫʹ�����ģʽ�Ľ���ԭʼ�࣬Ҳ���ǲ���ģʽӦ�õĳ�ʼ������<br>
 * 1.1 ʹ�õ��뵼���Ľӿ�
 * 
 * @author raylee
 * @data 2016-03-16
 * @version 1.1
 */
public class BaseServiceImpl {
	private Export exportObject;
	private Import importObject;

	public void setExportObject(Export exportObject) {
		this.exportObject = exportObject;
	}

	public void setImportObject(Import importObject) {
		this.importObject = importObject;
	}

	public void add() {
		System.out.println("add a new object");
	}

	public void update() {
		System.out.println("update object");
	}

	public void query() {
		System.out.println("query and return a object");
	}

	public void delete() {
		System.out.println("delete the object");
	}

	public void exportObject() {
		exportObject.exportObject();
	}

	public void importObject() {
		importObject.importObject();
	}
}
