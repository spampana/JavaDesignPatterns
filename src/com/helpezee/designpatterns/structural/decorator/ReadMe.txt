Decorator Design Pattern
------------------------

Decorator design pattern is used to modify the functionality of an object at runtime. 
At the same time other instances of the same class will not be affected by this, 
so individual object gets the modified behavior. 

We use inheritance or composition to extend the behavior of an object but this is done at compile time and 
its applicable to all the instances of the class. We can’t add any new functionality of remove any existing behavior 
at runtime

Notice that client program can create different kinds of Object at runtime and they can specify the 
order of execution too.



Decorator Design Pattern – Important Points
-------------------------------------------
Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible.

Its easy to maintain and extend when the number of choices are more.

The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).

Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.


Rules of thumb
--------------
Adapter provides a different interface to its subject. 
Proxy provides the same interface. 
Decorator provides an enhanced interface.

Adapter changes an object's interface, 
Decorator enhances an object's responsibilities. 
Decorator is thus more transparent to the client. As a consequence, Decorator supports recursive composition, 
which isn't possible with pure Adapters.

Composite and Decorator have similar structure diagrams, reflecting the fact that both rely on recursive composition to 
organize an open-ended number of objects.

A Decorator can be viewed as a degenerate Composite with only one component. 
However, a Decorator adds additional responsibilities - it isn't intended for object aggregation.

Decorator is designed to let you add responsibilities to objects without subclassing.
Composite's focus is not on embellishment but on representation. These intents are distinct but complementary. 
Consequently, Composite and Decorator are often used in concert.
Composite could use Chain of Responsibility to let components access global properties through their parent. 
It could also use Decorator to override these properties on parts of the composition.

Decorator and Proxy have different purposes but similar structures. Both describe how to provide a level of indirection 
to another object, and the implementations keep a reference to the object to which they forward requests.

Decorator lets you change the skin of an object. Strategy lets you change the guts.