package strategy.classes;

import strategy.interfaces.Repairable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class ExternalRepair implements Repairable {

    public void repair() {
        System.out.println("Repairable by external technician.");
    }
}
