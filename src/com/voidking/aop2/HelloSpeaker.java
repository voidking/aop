package com.voidking.aop2;

public class HelloSpeaker implements IHello {

	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello,"+name);
	}

}
