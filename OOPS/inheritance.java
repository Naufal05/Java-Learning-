class PetAnimal {
    // field and method of the parent class.
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}
// Inherit from the PetAnimal

class Dog extends PetAnimal {
    // new method in the subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Main1 {
    public static void main(String[] args) {
        // create an object of the subclass
        Dog labrador = new Dog();
        labrador.name = "Koko";
        labrador.display();

        // call method of superclass using object of the subclass
        labrador.eat();
    }
}