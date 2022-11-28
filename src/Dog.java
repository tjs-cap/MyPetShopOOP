public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void dig(){
        System.out.println(getName() + " digs a hole!");
    }
}
