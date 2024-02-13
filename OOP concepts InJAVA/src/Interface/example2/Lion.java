package Interface.example2;

public class Lion implements IAnimal{
    @Override
    public void eat() {
        System.out.println("Lion is eating flesh");
    }

    @Override
    public void drink() {
        System.out.println("Lion is drinking blood");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }
}
