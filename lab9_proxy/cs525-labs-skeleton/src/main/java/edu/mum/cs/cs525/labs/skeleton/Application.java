package edu.mum.cs.cs525.labs.skeleton;

import java.lang.reflect.Proxy;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		Complex comp = new ComplexClass();
		Complex proxy = (Complex) Proxy.newProxyInstance(
				Complex.class.getClassLoader(),
				new Class[]{Complex.class},
				new LoggingInvocationHandler(comp)
		);
		UsefulService usefulService = new UsefulService(proxy);
		usefulService.showAnotherTask();
		usefulService.showComplicatedTask();
	}
}
