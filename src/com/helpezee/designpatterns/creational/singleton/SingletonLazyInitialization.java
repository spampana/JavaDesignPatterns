package com.helpezee.designpatterns.creational.singleton;

public class SingletonLazyInitialization {

	/** private constructor to prevent others from instantiating this class */
	private SingletonLazyInitialization() {
		// protect against instantiation via reflection
		if (instance != null) {
			throw new IllegalStateException("Singleton already initialized");
		}
	}

	/** Create an instance of the class at the time of class loading */
	private static SingletonLazyInitialization instance;

	/** Provide a global point of access to the instance */
	public static SingletonLazyInitialization getInstance() {
		if (instance == null)
			instance = new SingletonLazyInitialization();
		return instance;
	}
}
