public class Dog extends Pet {

    //This constructor derives from the Pet class. Note that the variables
    //are not listed here, but instead are extended from the Pet class.
    public Dog(String name, int age) {
        super(name, age);
    }

    //This method can only be used by the Dog class and any of it's child classes.
    public void dig(){
        System.out.println(getName() + " digs a hole!");
    }

    //This method overrides the makeSound method found in the Pet class.
    //This method is used instead of the Pet's makeSound method.
    //Overrides is implied and doesn't need to be stated.
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }

    //This method must be created as the class is a subclass of Pet
    //and eats is the abstract method found in Pet.
    public void eats(){
        System.out.println("Nom nom nom!");
    }
}
