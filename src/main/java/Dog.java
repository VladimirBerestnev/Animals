public class Dog extends Pets{

    String name;
    int age;
    String type = "Dog";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dog(){}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;

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
