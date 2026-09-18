abstract class Car{
    void brake(){
        System.out.println("Break applied");
    }
    void accelerate(){
        System.out.println("Car accelerated");
    }
    abstract void drive();
}
class fuelCar extends Car{
    void drive(){
        System.out.println("Fuel car drives");
    }
}
class electricCar{
    void drive(){
        System.out.println("Electric car drives");
    }
}
public class Abstraction{
    public static void main(String[] args){
        Car fuel = new fuelCar();
        Car electric = new fuelCar();

        fuel.drive();
        electric.drive();
    }
}