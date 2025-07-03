// LivingBeing interface
interface LivingBeing {
    void breathe();
    void grow();
}

// Fish class implementing LivingBeing
class Fish implements LivingBeing {
    @Override
    public void breathe() {
        System.out.println("Fish breathes through gills");
    }
    
    @Override
    public void grow() {
        System.out.println("Fish grows from fry to adult");
    }
    
    public void specialFeature() {
        System.out.println("Special Feature: Can breathe underwater using gills");
    }
}

// Bird class implementing LivingBeing
class Bird implements LivingBeing {
    @Override
    public void breathe() {
        System.out.println("Bird breathes through lungs");
    }
    
    @Override
    public void grow() {
        System.out.println("Bird grows from chick to adult");
    }
    
    public void specialFeature() {
        System.out.println("Special Feature: Can fly with wings");
    }
}

// Main class
public class MainBird {
    public static void main(String[] args) {
        // Fish demonstration
        Fish myFish = new Fish();
        System.out.println("--- Fish Characteristics ---");
        myFish.breathe();
        myFish.grow();
        myFish.specialFeature();
        
        // Bird demonstration
        Bird myBird = new Bird();
        System.out.println("\n--- Bird Characteristics ---");
        myBird.breathe();
        myBird.grow();
        myBird.specialFeature();
    }
}