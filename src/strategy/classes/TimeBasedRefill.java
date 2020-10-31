package strategy.classes;

import strategy.interfaces.Refillable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class TimeBasedRefill implements Refillable {

    public void refill() {
        System.out.println("Time based refill.");
    }
}