public class Animal {

    private AnimalType animalType;
    private String name;
    private int age;
    private boolean haveHome;

    public Animal(){
    }

    public Animal(AnimalType animalType, String name, int age, boolean haveHome){
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.haveHome = haveHome;
    }

    public void sayHello(){
        System.out.println("Hello! I'm " + animalType + " " + name + " with age - " + age + "years old.");

        if(!haveHome){
            System.out.println("I don't have a home, please shelter me :( \n");
        } else {
            System.out.println("I'm happy because I have a home and a family :) \n");
        }
    }

}
