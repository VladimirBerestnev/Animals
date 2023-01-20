public class Horse extends Packs{

    String name;
    int age;
    String type = "Horse";

    public Horse(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Horse() {
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
