public class Main {

    public static void main(String[] arg) {
        Animal animal1 = new Animal(AnimalType.DOG, "Bobic", 10, false);
        animal1.sayHello();

        Animal animal2 = new Animal(AnimalType.CAT, "Simka", 1, true);
        animal2.sayHello();

        Animal animal3 = new Animal(AnimalType.COW, "Zorika", 5, true);
        animal3.sayHello();

        Animal animal4 = new Animal(AnimalType.ELEPHANT, "Maxim", 3, false);
        animal4.sayHello();

        Animal animal5 = new Animal(AnimalType.LION, "Dima", 2, false);
        animal5.sayHello();
    }
}
