abstract class Animal {
    // abstract method does nto have a body
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("zzz");
    }
}

// Subclass - Inherit from Animal
class Pig extends Animal {
    public void animalSound() {
        // the body of the animal sound is provided here
        System.out.println("The pgi says : wee wee wee ");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // create a pig object.
        myPig.animalSound();
        myPig.sleep();
    }
}
