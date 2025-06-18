// Question Number 10   


public class MainLamp {
    public static void main(String[] args) {
        // Create Lamp instance (prints creation state)
        Lamp lamp = new Lamp();

        // Toggle lamp state
        lamp.turnOn();   // prints "Lamp is now On"
        lamp.turnOff();  // prints "Lamp is now Off"

        // Optionally check state programmatically
        System.out.println("Final lamp state: " + (lamp.isOn() ? "On" : "Off"));
    }
}
