Composite Design Pattern
------------------------

Compose objects into tree structures to represent whole-part hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.

Composite Pattern consists of following objects.
-----------------------------------------------

Base Component – Base component is the interface for all objects in the composition, 
				 client program uses base component to work with the objects in the composition. 
				 It can be an interface or an abstract class with some methods common to all the objects.

Leaf – 			Defines the behaviour for the elements in the composition. 
				It is the building block for the composition and implements base component. 
				It doesn’t have references to other Components.

Composite – It consists of leaf elements and implements the operations in base component.


Composite Pattern Important Points
----------------------------------
Composite pattern should be applied only when the group of objects should behave as the single object.

Composite design pattern can be used to create a tree like structure.

java.awt.Container#add(Component) is a great example of Composite pattern in java and used a lot in Swing.



Rules of thumb
--------------

Composite and Decorator have similar structure diagrams, reflecting the fact that both rely on recursive composition 
to organize an open-ended number of objects.

Composite can be traversed with Iterator. Visitor can apply an operation over a Composite. 

Composite could use Chain of Responsibility to let components access global properties through their parent. 
It could also use Decorator to override these properties on parts of the composition. 
It could use Observer to tie one object structure to another and State to let a component change its behavior as its state changes.

Composite can let you compose a Mediator out of smaller pieces through recursive composition.

Decorator is designed to let you add responsibilities to objects without subclassing. 
Composite's focus is not on embellishment but on representation. 
These intents are distinct but complementary. Consequently, Composite and Decorator are often used in concert.

Flyweight is often combined with Composite to implement shared leaf nodes.
