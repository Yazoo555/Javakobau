abstract class Vehicle {
    public abstract void wheel();   
    public void door() {           
        System.out.println("This vehicle has doors.");
    }
}

class Bus extends Vehicle {
    @Override
    public void wheel() {
        System.out.println("A bus has 6 wheels.");
    }

    @Override
    public void door() {
        System.out.println("A bus has 2 doors.");
    }
}

public class MainBbus {
    public static void main(String[] args) {
        Bus myBus = new Bus();
        myBus.wheel();  
        myBus.door();   
    }
}