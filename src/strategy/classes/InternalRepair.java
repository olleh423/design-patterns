package strategy.classes;

import strategy.interfaces.Repairable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class InternalRepair implements Repairable {

    public void repair() {
        System.out.println("Self repairable.");
    }
}
