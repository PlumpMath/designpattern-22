package com.raylee.designpattern.strategy.ch01;

/**
 * 这个类是我们需要使用设计模式改进的原始类，也就是策略模式应用的初始环境。
 * 
 * @author raylee
 * @data 2016-03-16
 * @version 1.0
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
}
