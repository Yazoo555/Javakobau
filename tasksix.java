// PowerOnOff interface
interface PowerOnOff {
    void turnOn();
    void turnOff();
}

// DeviceInfo interface
interface DeviceInfo {
    void displayInfo();
}

// ElectronicDevice interface extends both
interface ElectronicDevice extends PowerOnOff, DeviceInfo {
    // Inherits all methods from PowerOnOff and DeviceInfo
}

// Television class implementing both PowerOnOff and DeviceInfo
class Television implements PowerOnOff, DeviceInfo {
    @Override
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is now OFF.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Television Info: Brand - LG, Size - 55 inches, Type - LED.");
    }
}

// Main class named TaskSix
public class TaskSix {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.displayInfo();  // Call displayInfo
        tv.turnOn();       // Call turnOn
        tv.turnOff();      // Call turnOff
    }
}
