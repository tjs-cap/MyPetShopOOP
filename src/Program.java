import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        //Create p object from Pets class using full constructor
        Pets p = new Pets("Fido",6,24.8f,
                "black and white","dog","border collie");
        //Create p1 object from Pets class using the reduced constructor
        Pets p1 = new Pets("K8t",8);
        //Create lp object from the LikePets record class
        LikePets lp = new LikePets("Fido",6,24.8f,
                "black and white","dog","border collie");

        //Display pets object
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getWeight());
        System.out.println(p.getColour());
        System.out.println(p.getType());
        System.out.println(p.getBreed());

        //Modify and display weight of p object
        p.setWeight(23.2f);
        System.out.println(p.getWeight());
        //Display name and breed of p object
        System.out.println(p.getName() + " is a " + p.getBreed());
        //Call class method getsOlder from Pets class to
        //update the age variable for the p object
        p.getsOlder();
        //Display new listing for p object demonstrating
        //a change to the age variable
        System.out.println(p.getName() + " is " + p.getAge() + " years old!") ;
    }
}
