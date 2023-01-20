public class Hamster extends Pets{

    String name;
    int age;
    String type = "Hamster";

    public Hamster(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Hamster() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
