package com.voidking.aop;

public class ProxyDemo {
	public static void main(String[] args) {
		IHello proxy = new HelloProxy(new HelloSpeaker2());
		proxy.hello("Justin");
	}
}
