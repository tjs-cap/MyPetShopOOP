public record LikePets(String name, int age, float weight,
                       String colour, String type, String breed) {
}

//Below is the details that are hidden that are included
//in the record class type.

//import java.util.Objects;
//
//public final class LikePets {
//    private final String name;
//    private final int age;
//    private final float weight;
//    private final String colour;
//    private final String type;
//    private final String breed;
//
//    public LikePets(String name, int age, float weight,
//                    String colour, String type, String breed) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.colour = colour;
//        this.type = type;
//        this.breed = breed;
//    }
//
//    public String name() {
//        return name;
//    }
//
//    public int age() {
//        return age;
//    }
//
//    public float weight() {
//        return weight;
//    }
//
//    public String colour() {
//        return colour;
//    }
//
//    public String type() {
//        return type;
//    }
//
//    public String breed() {
//        return breed;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) return true;
//        if (obj == null || obj.getClass() != this.getClass()) return false;
//        var that = (LikePets) obj;
//        return Objects.equals(this.name, that.name) &&
//                this.age == that.age &&
//                Float.floatToIntBits(this.weight) == Float.floatToIntBits(that.weight) &&
//                Objects.equals(this.colour, that.colour) &&
//                Objects.equals(this.type, that.type) &&
//                Objects.equals(this.breed, that.breed);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, weight, colour, type, breed);
//    }
//
//    @Override
//    public String toString() {
//        return "LikePets[" +
//                "name=" + name + ", " +
//                "age=" + age + ", " +
//                "weight=" + weight + ", " +
//                "colour=" + colour + ", " +
//                "type=" + type + ", " +
//                "breed=" + breed + ']';
//    }
//
//}
