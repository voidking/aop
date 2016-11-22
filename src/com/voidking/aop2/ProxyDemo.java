package com.voidking.aop2;

import java.lang.reflect.Proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloSpeaker helloSpeaker = new HelloSpeaker();
		LogHandler logHandler = new LogHandler(helloSpeaker);
		Class cls = helloSpeaker.getClass();
		IHello iHello = (IHello)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), logHandler);
		iHello.hello("Justin");
	}

}
