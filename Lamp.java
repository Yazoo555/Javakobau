// Question Number 10   

public class Lamp {
    private boolean isOn;

    // No-argument constructor: lamp starts off
    public Lamp() {
        this.isOn = false;
        System.out.println("Lamp created! Current state: " + (isOn ? "On" : "Off"));
    }

    // Turn on the lamp and print status
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is now On");
    }

    // Turn off the lamp and print status
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is now Off");
    }

    // Getter for isOn
    public boolean isOn() {
        return isOn;
    }
}
