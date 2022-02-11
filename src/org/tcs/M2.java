package org.tcs;

public class M2 {
	
	public M2() {
		System.out.println("This is a parent default cons");
	}

	public M2(String name) {
		this();
		System.out.println("String para cons");
	}
}
