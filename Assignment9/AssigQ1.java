class Vehicle {
    void drive() {
        System.out.println("Driving a Vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a Car");
    }
}

public class AssigQ1 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();

        v1.drive();
        c1.drive();
    }
}