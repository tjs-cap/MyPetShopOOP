public class Bird extends Pet implements Fly,Walk{
    private float wingspan;

    public Bird(String name, int age,float wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public void eats() {
        System.out.println("Peck peck!");
    }
}
