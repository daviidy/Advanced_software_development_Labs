package edu.mum.cs.cs525.labs.skeleton;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoggingInvocationHandler implements InvocationHandler {

    private Complex complex;

    public LoggingInvocationHandler(Complex complex) {
        this.complex = complex;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(String.format("Calling method %s with args: %s",
                method.getName(), Arrays.toString(args)));
        try {
            if (method.getName() == "veryComplicatedTask"){
                return method.invoke(complex, args);
            }
        } catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;

    }
}
