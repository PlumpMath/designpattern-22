package com.raylee.designpattern.strategy.ch02;

/**
 * �������������Ҫʹ�����ģʽ�Ľ���ԭʼ�࣬Ҳ���ǲ���ģʽӦ�õĳ�ʼ������<br>
 * �����˵��뵼������<br>
 * 
 * @author raylee
 * @data 2016-03-16
 * @version 1.1
 */
public class BaseServiceImpl {
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

	public void importObjects() {
		System.out.println("import the objects");
	}

	public void exportObjects() {
		System.out.println("export the objects");
	}
}
