package strategy.classes;

import strategy.interfaces.Refillable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class NoRefill implements Refillable {

    public void refill() {
        System.out.println("No refill required.");
    }
}
