import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static ArrayList<Pets> pets = new ArrayList<>();
   public static ArrayList<Packs> packs = new ArrayList<>();


    public static void main(String[] args) {


       while(true) {

           printAdd();

           Scanner sc1 = new Scanner(System.in);

           try {
               String type = sc1.nextLine();
               int number = Integer.parseInt(type);
               if (number == 0){
                   System.exit(0);
               }
               add(number);

           } catch (NumberFormatException e) {
               System.out.println("Неверный ввод");
           }
       }
    }


    public static void add (int number){

        System.out.println("Введите имя животного:");
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
        System.out.println("Введите возраст животного:");

        try {
            int age = Integer.parseInt(sc2.nextLine());

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
        System.out.println("1 - собака, 2 - кошка, 3 - хомяк, 4 - лошадь, 5 - верблюд, 6 - осел");
        System.out.println("Нажмите 0, если хотите выйти");
    }


    }


