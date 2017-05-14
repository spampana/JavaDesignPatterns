package com.helpezee.designpatterns.creational.abstractfactory;

public class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
	}