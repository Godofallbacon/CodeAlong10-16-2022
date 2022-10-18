package NumberFive;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {

        // interface segregation states that a client shouldn't be forced to implement an interface that it doesn't use
        //

    }
}

interface Worker {
    void work();
}

interface Sleeping {
    void sleep();
}

class Human implements Worker, Sleeping {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot implements Worker {
    //took away sleep from robot cause why does a robot need to sleep

    @Override
    public void work() {}
}
