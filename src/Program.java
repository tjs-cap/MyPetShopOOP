public class Program {
    public static void main(String[] args) {
//        Pet obj = new Pet("Fido",7);
//        System.out.println(obj.getName() + " " + obj.getAge());
//        obj.getsOlder();
//        System.out.println(obj.getName() + " " + obj.getAge());

        Dog d = new Dog("Lollie",6);
        System.out.println(d.getName());
        d.makeSound();
        d.dig();

        Cat c = new Cat("Katie",13,"Tabby");
        System.out.println(c.getName());
        c.makeSound();

//        Pet p = new Pet("Trixy",2);
//        System.out.println(p.getName());
//        p.makeSound();

        BorderCollie bc = new BorderCollie("Fido",9);
        System.out.println(bc.getName());
        bc.makeSound();

        Bird b = new Bird("Tweety",3,4.5f);
        System.out.println(b.getName());
        b.makeSound();
    }
}
