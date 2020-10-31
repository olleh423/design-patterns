package strategy.classes;

import strategy.interfaces.Repairable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class NoRepair implements Repairable {

    public void repair() {
        System.out.println("No repairing required.");
    }
}
