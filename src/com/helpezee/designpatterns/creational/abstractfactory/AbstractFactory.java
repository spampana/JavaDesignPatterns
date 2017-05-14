package com.helpezee.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	}