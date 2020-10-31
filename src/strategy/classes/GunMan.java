package strategy.classes;

import strategy.abstractClasses.Soldier;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class GunMan extends Soldier {

    public GunMan() {
        setRefillBehaviour(new TimeBasedRefill());
        setRepairBehaviour(new NoRepair());
    }

    public void attack() {
        System.out.println("Attacking by Guns.");
    }
}