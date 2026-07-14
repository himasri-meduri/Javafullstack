interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}
interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}
class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
    }
}
public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        System.out.println("--- Calling Car message() ---");
        myCar.message();
    }
}
