package com.helpezee.designpatterns.creational.singleton;

public class SingletonEagerlyInitialization {

	/** private constructor to prevent others from instantiating this class */
	private SingletonEagerlyInitialization() {
		// protect against instantiation via reflection
        if(instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
	}

	/** Create an instance of the class at the time of class loading */
	private static SingletonEagerlyInitialization instance = getInstance();

	/** Provide a global point of access to the instance */
	public static SingletonEagerlyInitialization getInstance() {
		instance = new SingletonEagerlyInitialization();
		return instance;
	}

}
