public class Pets {

    //Fields or variables
    private String name;
    private int age;
    private float weight;
    private String colour;
    private String type;
    private String breed;

    //Main constructor (note, name of the constructor
    //is the same as the class name
    protected Pets(String name, int age, float weight, String colour, String type, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.type = type;
        this.breed = breed;
    }

    //Reduced, modified constructor
    public Pets(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Full set of getters and setters
    //Removed breed and type setters as discussed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeightinKgs() {
        return weight + "kgs";
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    //Example of a class method which adjusts
    //the objects variables
    public int getsOlder() {
        return age++;
    }
}
