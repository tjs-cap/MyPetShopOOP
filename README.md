# MyPetShopOOP
This is a demonstration of the characteristics of the four pillars of OOP: Abstraction, Encapsulation, Inheritance, Polymoprphism.

The parent class, Pet aka Superclass, is the main class.  This is an abstract class and therefore can be instantiated.  Within the Pet class is an abstract method, eats, which demonstrates another tool that can be used, where we create a template that has to be implemented in all the child classes of the Pet class.
Dog, Cat and Bird classes all inherits from the Pet class, so all the characteristics of the Pet class are available to each of these classes.  Where we have a method found inside of one of the child classes with the same name as the parent or super class, the method in the child class overrides the use of the parent class and uses the child's method instead.
The BorderCollie class is a child class of Dog class and has all the properties and methods of the Dog class, which inherits from the Pet class.
Fly and Walk are both interfaces and can be implemented into which ever class needs to use these classes.
