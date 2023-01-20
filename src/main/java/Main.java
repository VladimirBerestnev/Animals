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
                   showPets();
                   showPacks();
               }
               if (act == 3){
                   System.out.println("1 - Домашнее животное, 2 - вьючное животное, 0 - назад");
                   try {
                       String command = sc1.nextLine();
                       int number = Integer.parseInt(command);
                       if (number == 0){
                           return;
                       } else if (number == 1){
                           showPets();
                           learnPets();
                       } else if (number == 2){
                           showPacks();
                           learnPacks();
                       } else {
                           System.out.println("Неверный ввод");

                       }
                   } catch (NumberFormatException e) {
                       System.out.println("Неверный ввод");
                   }
               }
           } catch (NumberFormatException e) {
               System.out.println("Неверный ввод");
           }

       }
    }

    private static void learnPets() {

        System.out.println("Напишите имя животного для обучения новым командам:");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        for (Pets pet : pets) {
            if (pet.getName().equals(name)){
                System.out.println(pet.getType() + " " + pet.getName() + " " + pet.getAge());

                System.out.println();
                command();
                return;

            }
        }
        System.out.println("Такого имени не найдено");

    }

    private static void learnPacks() {

        System.out.println("Напишите имя животного для обучения новым командам:");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        for (Packs pack : packs) {
            if (pack.getName().equals(name)){
                System.out.println(pack.getType() + " " + pack.getName() + " " + pack.getAge());

                System.out.println();
                command();
                return;
            }
        }
        System.out.println("Такого имени не найдено");

    }

    private static void command() {
        System.out.println("Какой команде обучить животное?");
        System.out.println("1 - голос, 2 - охранять, 3 - носить, 4 - бежать, 0 - назад");
        Scanner sc4 = new Scanner(System.in);
        try {
            String com = sc4.nextLine();
            int number = Integer.parseInt(com);
            if (number == 0){
                return;
            } else if (number == 1){
                System.out.println("Команда изучена");
                return;
            } else if (number == 2){
                System.out.println("Команда изучена");
                return;
            } else if (number == 3){
                System.out.println("Команда изучена");
                return;
            } else if (number == 4){
                System.out.println("Команда изучена");
                return;
            } else {
                System.out.println("Неверный ввод");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        }
    }

    private static void showPets() {

        System.out.println("Домашние животные");

        for (Pets pet : pets) {
            System.out.println(pet.getType() + " " + pet.getName() + " " + pet.getAge());
        }
    }
        private static void showPacks() {
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


