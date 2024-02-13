package Interface.example2;

public class Rabbit implements IAnimal{
    @Override
    public void eat() {
        System.out.println("rabbit is eating grass");
    }

    @Override
    public void drink() {
        System.out.println("rabbit is drinking water");
    }

    @Override
    public void walk() {
        System.out.println("rabbit is Hopping");
    }
}
