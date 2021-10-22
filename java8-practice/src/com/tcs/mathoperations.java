package com.tcs;

public interface mathoperations {
	void method1();
	void method2();
	static void method3() {
		System.out.println("static method inside Test");
	}
	default void method4() {
		System.out.println("default method4() inside Test");
	}
}
