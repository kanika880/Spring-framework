package com.spring.foobar.beans;

public class Foo {
	private String name;
	
	public Foo() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Foo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Foo [name=" + name + "]";
	}
	
}
