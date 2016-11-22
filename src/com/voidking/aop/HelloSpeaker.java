package com.voidking.aop;

import java.util.logging.*;

public class HelloSpeaker {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	public void hello(String name)
	{
		logger.log(Level.INFO, "hello method starts...");
		System.out.println("hello,"+name);
		logger.log(Level.INFO, "hello method ends...");
	}
}
