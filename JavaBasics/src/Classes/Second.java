package Classes;

import Interfaces.IFirst;

public class Second implements IFirst {

    @Override
    public void printSomething() {
        System.out.println("something");
    }
}
