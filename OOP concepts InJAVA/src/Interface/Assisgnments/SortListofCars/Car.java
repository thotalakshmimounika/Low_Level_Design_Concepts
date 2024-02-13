package Interface.Assisgnments.SortListofCars;

public class Car implements Comparable<Car>{
    int Price;
    int Speed;
    @Override
    public int compareTo(Car NextCar) {
        return this.Price-NextCar.Price;
    }
}
