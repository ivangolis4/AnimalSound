class AnimalManager {
    Animal Animal;

    public AnimalManager(Animal Animal){
        this.Animal = Animal;
    }

    public String getSound(){
        return Animal.sound();
    }
}