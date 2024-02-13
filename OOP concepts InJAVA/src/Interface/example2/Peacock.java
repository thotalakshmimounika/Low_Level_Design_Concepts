package Interface.example2;

public class Peacock implements IAnimal{
    @Override
    public void eat() {
        System.out.println("Peacock is eating leaves");
    }

    @Override
    public void drink() {
        System.out.println("Peacock in drking rain water");
    }

    @Override
    public void walk() {
        System.out.println("Peacock is dancing");
    }
}
