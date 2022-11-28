public class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getsOlder(){
        age++;
    }

    public void makeSound(){
        System.out.println("Hmph!");
    }
}
