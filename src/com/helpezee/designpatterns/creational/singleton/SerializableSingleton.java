package com.helpezee.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
	private static final long serialVersionUID = 8806820726158932906L;

	private static SerializableSingleton instance;

	private SerializableSingleton() {
	}

	public static synchronized SerializableSingleton getInstance() {
		if (instance == null) {
			instance = new SerializableSingleton();
		}
		return instance;
	}

	/*
	 * To prevent the de-serialization process from creating a new instance, you can
	 * implement the readResolve() method in the singleton class. It is invoked when
	 * the object is de-serialized.
	 * 
	 * solution : implement readResolve method to return the existing instance
	 */
	protected Object readResolve() {
		return instance;
	}
}

//https://www.callicoder.com/java-singleton-design-pattern-example/