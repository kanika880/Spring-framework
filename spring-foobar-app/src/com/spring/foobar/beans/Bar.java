package com.spring.foobar.beans;

public class Bar {
	private String name;
	private int age;
	private Foo foo;
	
	public Bar() {
		
	}

	public Bar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	@Override
	public String toString() {
		return "Bar [foo=" + foo + "]";
	}
	
}
