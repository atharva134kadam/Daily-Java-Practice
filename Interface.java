interface Car {
    void brake();
    void accelerate();
    void drive();
}

class FuelCar implements Car {
    public void brake() {
        System.out.println("Fuel car brakes");
    }
    public void accelerate() {
        System.out.println("Fuel car accelerates");
    }
    public void drive() {
        System.out.println("Fuel car drives");
    }
}

class ElectricCar implements Car {
    public void brake() {
        System.out.println("Electric car brakes");
    }
    public void accelerate() {
        System.out.println("Electric car accelerates");
    }
    public void drive() {
        System.out.println("Electric car drives");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car fuel = new FuelCar();
        Car electric = new ElectricCar();
        
        fuel.drive();
        electric.drive();
    }
}