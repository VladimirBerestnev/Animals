import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static ArrayList<Pets> pets = new ArrayList<>();
   public static ArrayList<Packs> packs = new ArrayList<>();


    public static void main(String[] args) {

        initializeLists();

       while(true) {

           System.out.println("Выберите действие: 1 - добавить животное, 2 - просмотр животных, 3 - обучение новым командам, 0 - выход");
           Scanner sc1 = new Scanner(System.in);
           try {
               String action = sc1.nextLine();
               int act = Integer.parseInt(action);
               if (act == 0){
                   System.exit(0);
               }
               if (act == 1){
                    addAnimal();
               }
               if (act == 2){
                   showAnimal();
               }


           } catch (NumberFormatException e) {
               System.out.println("Неверный ввод");
           }

       }
    }

    private static void showAnimal() {

        System.out.println("Домашние животные");

        for (Pets pet : pets){
            System.out.println(pet.getType() + " " + pet.getName() + " " + pet.getAge());
        }
        System.out.println("");
        System.out.println("Вьючные животные");

        for (Packs pack : packs){
            System.out.println(pack.getType() + " " + pack.getName() + " " + pack.getAge());
        }


    }

    private static void addAnimal() {
        printAdd();
        Scanner sc2 = new Scanner(System.in);
        try {
            String type = sc2.nextLine();
            int number = Integer.parseInt(type);
            if (number == 0){
                return;
            }
            add(number);

        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }

    private static void initializeLists() {

        pets.add(new Dog("Tuzik", 3));
        pets.add(new Cat("Murzik", 1));
        pets.add(new Hamster("Zhora", 1));

        packs.add(new Horse("Merin", 10));
        packs.add(new Camel("Petya", 15));
        packs.add(new Donkey("Osel", 3));

    }


    public static void add (int number){

        System.out.println("Введите имя животного. 0 - отмена ввода");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
        if (name.equals("0")){
            return;
        }
        System.out.println("Введите возраст животного. 0 - отмена ввода");

        try {
            int age = Integer.parseInt(sc2.nextLine());
            if (age == 0){
                return;
            }
            switch (number) {
                case 1 -> {
                    Dog dog = new Dog(name, age);
                    pets.add(dog);
                }
                case 2 -> {
                    Cat cat = new Cat(name, age);
                    pets.add(cat);
                }
                case 3 -> {
                    Hamster hamster = new Hamster(name, age);
                    pets.add(hamster);
                }
                case 4 -> {
                    Horse horse = new Horse(name, age);
                    packs.add(horse);
                }
                case 5 -> {
                    Camel camel = new Camel(name, age);
                    packs.add(camel);
                }
                case 6 -> {
                    Donkey donkey = new Donkey(name, age);
                    packs.add(donkey);
                }
            }


        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод возраста");
        }



    }

    public static void printAdd(){
        System.out.println("Какое животное Вы хотите добавить?");
        System.out.println("1 - собака, 2 - кошка, 3 - хомяк, 4 - лошадь, 5 - верблюд, 6 - осел, 0 - назад");

    }


    }


