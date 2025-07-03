// LivingBeing interface
interface LivingBeing {
    void breathe();
    void grow();
}

// Animal interface extending LivingBeing
interface Animal extends LivingBeing {
    void eat();
    void walk();
}

// Printable interface
interface Printable {
    void display();
}

// Cow class implementing both Animal and Printable
class Cow implements Animal, Printable {
    // LivingBeing methods
    @Override
    public void breathe() {
        System.out.println("Cow breathes through lungs");
    }
    
    @Override
    public void grow() {
        System.out.println("Cow grows from calf to adult in 2 years");
    }
    
    // Animal methods
    @Override
    public void eat() {
        System.out.println("Cow eats grass and hay");
    }
    
    @Override
    public void walk() {
        System.out.println("Cow walks slowly on four legs");
    }
    
    // Printable method
    @Override
    public void display() {
        System.out.println("Cow Information: Domestic animal, provides milk");
    }
    
    // Special feature method
    public void specialFeature() {
        System.out.println("Special Feature: Cow has four stomachs for digestion!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        
        // LivingBeing methods
        myCow.breathe();
        myCow.grow();
        
        // Animal methods
        myCow.eat();
        myCow.walk();
        
        // Printable method
        myCow.display();
        
        // Special feature
        myCow.specialFeature();
    }
}