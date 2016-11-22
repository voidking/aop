package com.voidking.aop;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements IHello {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private IHello helloObject;
	public  HelloProxy(IHello helloObject) {
		// TODO Auto-generated constructor stub
		this.helloObject = helloObject;
	}
	
	
	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		log("hello method starts...");
		helloObject.hello(name);
		log("hello method ends...");
	}
	
	private void log(String msg)
	{
		logger.log(Level.INFO, msg);
	}

}
