package com.helpezee.designpatterns.creational.singleton;

public class SingletonDoubleCheckLockingLazyInitialization {

	/** private constructor to prevent others from instantiating this class */
	private SingletonDoubleCheckLockingLazyInitialization() {
		// protect against instantiation via reflection
		if (instance != null) {
			throw new IllegalStateException("Singleton already initialized");
		}
	}

	/** Create an instance of the class at the time of class loading */
	private static SingletonDoubleCheckLockingLazyInitialization instance;

	/** Provide a global point of access to the instance */
	// Lazily initialize the singleton in a synchronized block */
	public static SingletonDoubleCheckLockingLazyInitialization getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckLockingLazyInitialization.class) {
				// Double check
				if (instance == null) {
					instance = new SingletonDoubleCheckLockingLazyInitialization();
				}
			}
		}
		return instance;
	}
}
