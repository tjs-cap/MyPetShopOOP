// As an abstract class this is useful for inheritance as a template for all subclasses
public abstract class Pet {

    private String name;
    private int age;

    //Constructors are used to help create objects by stating the variables used
    //to create an object.
    //You can have multiple constructors, depending on how complex your objects are
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getters are used to get variable information from the class
    //Setters are used to change variable information in a class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Links directly with the age variable found inside this class.
    public void getsOlder(){
        age++;
    }

    //This is a simple class method, which all objects can call, as long
    //as they are linked to this class.
    public void makeSound(){
        System.out.println("Hmph!");
    }

    //Note the syntax for an abstract method, not quite the same as a normal method
    //No instructions are passed to other classes, but this needs to created in each
    //of the subclasses as a functional method.
    abstract public void eats();
}
