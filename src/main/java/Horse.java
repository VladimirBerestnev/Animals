public class Horse extends Packs{

    String name;
    int age;

    public Horse(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Horse() {
    }

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
}
