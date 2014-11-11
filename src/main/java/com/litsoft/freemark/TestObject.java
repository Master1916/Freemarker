package com.litsoft.freemark;

public class TestObject {
	private String name;
	private int price;

	public TestObject(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// JavaBean的属性
	// 注意公有字段不能直接可见；
	// 你必须为它们编写getter方法。
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// 一个方法
	public double sin(double x) {
		return Math.sin(x);
	}
}
