package com.raylee.designpattern.strategy.ch04;

/**
 * �������������Ҫʹ�����ģʽ�Ľ���ԭʼ�࣬Ҳ���ǲ���ģʽӦ�õĳ�ʼ������
 * 
 * @author raylee
 * @data 2016-03-16
 * @version 1.0
 */
public class BaseServiceImpl {
	private Export exportObject;
	private Import importObject;

	public BaseServiceImpl() {
		exportObject = new Export();
		importObject = new Import();
	}

	public Export getExportObject() {
		return exportObject;
	}

	public Import getImportObject() {
		return importObject;
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
}
