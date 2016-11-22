package com.voidking.aop;


public class HelloSpeaker2 implements IHello {
	
	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello,"+name);
	}

}
