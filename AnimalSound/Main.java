public class Main {

    public static void main(String[]args){

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal sheep = new Sheep();
        Animal Duck = new Duck();

        AnimalManager catSound = new AnimalManager(cat);
        AnimalManager dogsound = new AnimalManager(dog);
        AnimalManager cowSound = new AnimalManager(cow);
        AnimalManager sheepSound = new AnimalManager(sheep);
        AnimalManager duckSound = new AnimalManager(Duck);

        System.out.println("Cat sound is: " + catSound.getSound());
        System.out.println("Dog sound is: " + dogsound.getSound());
        System.out.println("Cow sound is: " + cowSound.getSound());
        System.out.println("Sheep sound is: " + sheepSound.getSound());
        System.out.println("Duck sound is: " + duckSound.getSound());

    }
}
    
    

