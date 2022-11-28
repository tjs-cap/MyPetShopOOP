public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);

    }

    public void dig(){
        System.out.println(getName() + " digs a hole!");
    }

    public void makeSound(){
        System.out.println("Woof! Woof!");
    }

    public void eats(){
        System.out.println("Nom nom nom!");
    }
}
