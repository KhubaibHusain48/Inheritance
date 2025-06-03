package ConceptsCode.Inheritance;
    // Superclass
    class Animal {
        String name;
        // Constructor with parameter
        Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor called. Name: " + name);
        }
    }

    // Subclass
    class Dog extends Animal {

        // Constructor in subclass
        Dog(String name) {
            // Call the superclass constructor
            super(name);
            System.out.println("Dog constructor called.");
        }
    }

    // Main class to run the program
    public class Main {
        public static void main(String[] args) {
            // Creating Dog object
            Dog myDog = new Dog("Tom");
        }
}
