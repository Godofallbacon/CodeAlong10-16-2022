package NumberFour;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        //liskov substitution states substitutability of a class by it's subclass, so a class can be replaced by it's subclass in all practical usage scenarios
        //if we have a ChildClass that extends a ParentClass we should only use inheritance if a ParentClass object can be used as a ChildClass object otherwise we should use composition or delegation
        //if we have a parent class BirdClass and a subclass Sparrow, if the parent class has a fly() method, the Sparrow class will have it aswell for extending it but if a Ostrich class also extends BirdClass it violates the LSP because an Ostrich can't fly, but it will extend the fly method, even though it is also a bird
        //a way of solving it would be to instead of having the fly() method that may violate the LSP when used from sub classes that don't actually fly, we could take this fly() method to another class that extends Bird that would be FlyingBird so only the birds wich extend it would have the fly() method and the birds that don't fly would extend directly Bird
        // We broke up the inheritance into a smaller level so the bird class wont be replaced by a sparrow class

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();

        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}

class Bird {

    public void greet() {
        System.out.println("greeting...");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Sparrow extends FlyingBird {
}

class Ostrich extends Bird {

}
