package strategy.classes;

import strategy.abstractClasses.Soldier;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class SwordMan extends Soldier {

    public SwordMan() {
        setRefillBehaviour(new NoRefill());
        setRepairBehaviour(new NoRepair());
    }

    public void attack() {
        System.out.println("Attacking by sword.");
    }
}