package edu.mum.cs.cs525.labs.skeleton.final_exam;

import edu.mum.cs.cs525.labs.skeleton.Complex;
import edu.mum.cs.cs525.labs.skeleton.ComplexClass;
import edu.mum.cs.cs525.labs.skeleton.LoggingInvocationHandler;
import edu.mum.cs.cs525.labs.skeleton.UsefulService;

import java.lang.reflect.Proxy;

public class Application {
	public static void main(String[] args) {
		Component root = new Composite();
		System.out.println(root.iterator());
	}
}
