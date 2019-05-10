package edu.handong.csee.java.inheritance;
// commit comment hello
// 2019. 05. 09
// hello world!
// hi for commit 2019. 5. 10
public class Cat extends Animal {
	
    // hiding : superclass에서 정의된 static method를 재정의해서 사용하는 것을 hiding 이라고 한다.  
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
	
    // overriding : superclass에서 정의된 method를 재정의해서 사용하는 것을 overriding 이라고 한다. 
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod(); // hiding
        
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod(); // overriding
        
        Animal myDog = new Dog(); // polymorphism : Animal 타입으로 선언 된 myAnimal, myDog이 Cat이 될 수도, Dog이 될 수도 있다. 이것을 polymorphism이라고 한다. 
        myDog.testInstanceMethod();
        
        System.out.println("HELLO WORLD!");
	System.out.println("Hi Guys!");
    }
}
