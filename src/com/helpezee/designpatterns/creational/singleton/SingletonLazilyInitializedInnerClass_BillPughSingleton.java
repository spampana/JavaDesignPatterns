package com.helpezee.designpatterns.creational.singleton;

public class SingletonLazilyInitializedInnerClass_BillPughSingleton {

	/** private constructor to prevent others from instantiating this class */
	private SingletonLazilyInitializedInnerClass_BillPughSingleton() {
		
	}

	/**
	 * This inner class is loaded only after getInstance() is called for the first time.
	 */
	private static class SingletonHelper {
		private static final SingletonLazilyInitializedInnerClass_BillPughSingleton INSTANCE = new SingletonLazilyInitializedInnerClass_BillPughSingleton();
	}

	public static SingletonLazilyInitializedInnerClass_BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
