package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
	// hiding
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
	
    // overriding
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod(); // hiding
        
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod(); // overriding
        
        Animal myDog = new Dog(); // polymorphism
        myDog.testInstanceMethod();
    }
}
