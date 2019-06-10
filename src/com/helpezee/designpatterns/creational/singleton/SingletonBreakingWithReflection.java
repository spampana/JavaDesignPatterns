package com.helpezee.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class SingletonBreakingWithReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {	
		SingletonEagerlyInitialization instance = SingletonEagerlyInitialization.getInstance();
		SingletonEagerlyInitialization reflectionInstance = null;
		
		Constructor<?>[]  refConstructors = SingletonEagerlyInitialization.class.getDeclaredConstructors();
		for(Constructor constructor : refConstructors) {
			constructor.setAccessible(true);
			reflectionInstance = (SingletonEagerlyInitialization) constructor.newInstance();
		}
		System.out.println("singletonInstance hashCode: " + instance.hashCode());
        System.out.println("reflectionInstance hashCode: " + reflectionInstance.hashCode());
	}

}
