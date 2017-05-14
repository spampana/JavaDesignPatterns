Proxy Design Pattern
--------------------

Provide a surrogate or placeholder for another object to control access to it.

Add a wrapper and delegation to protect the real component from undue complexity.


Let’s say we have a class that can run some command on the system. Now if we are using it, its fine but if we want 
to give this program to a client application, it can have severe issues because client program can issue command to 
delete some system files or change some settings that you don’t want.

Here a proxy class can be created to provide controlled access of the program.

Rules of thumb
-------------
Adapter provides a different interface to its subject. 

Proxy provides the same interface. 

Decorator provides an enhanced interface.

Decorator and Proxy have different purposes but similar structures. 
Both describe how to provide a level of indirection to another object, and the implementations keep a reference to the 
object to which they forward requests.
