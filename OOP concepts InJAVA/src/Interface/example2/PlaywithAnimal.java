package Interface.example2;

public class PlaywithAnimal {
    private IAnimal animal;

    public PlaywithAnimal(){
        animal = new Peacock();
    }

    public void doAnimalthings(){
        animal.eat();
        animal.drink();
        animal.walk();
    }
}
