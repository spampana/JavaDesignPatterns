Template Method Pattern
=======================

The Template Method pattern is used when two or more implementations of a similar algorithm exist. 
Template Method pattern, which defines a stub for an algorithm, deferring some implementation steps to subclasses.
In the real world templates are used all the time: for architectural plans, and throughout the engineering domain.
A template plan may be defined which is then built on with further variations. 

For example, a basic house plan can have many variations such as adding an extensions or using a different heating system.


Code Explanation
----------------

buildHouse() is the template method and defines the order of execution for performing several steps.



Template Method Design Pattern in JDK
-------------------------------------

All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.

Template Method Design Pattern Important Points
-----------------------------------------------
Template method should consists of certain steps whose order is fixed and for some of the methods, implementation differs from base class to subclass. Template method should be final.

Most of the times, subclasses calls methods from super class but in template pattern, superclass template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, we’ll call you.”.

Methods in base class with default implementation are referred as Hooks and they are intended to be overridden by subclasses, if you want some of the methods to be not overridden, you can make them final, for example in our case we can make buildFoundation() method final because if we don’t want subclasses to override it.



Rules of thumb
==============
Strategy is like Template Method except in its granularity.

Template Method uses inheritance to vary part of an algorithm. 
Strategy uses delegation to vary the entire algorithm.

Strategy modifies the logic of individual objects. 
Template Method modifies the logic of an entire class.

Factory Method is a specialization of Template Method.
