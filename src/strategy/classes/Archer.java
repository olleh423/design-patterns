package strategy.classes;

import strategy.abstractClasses.Soldier;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class Archer extends Soldier {

    public Archer() {
        setRefillBehaviour(new WeaponBasedRefill());
        setRepairBehaviour(new NoRepair());
    }

    public void attack() {
        System.out.println("Attacking by Bow and Arrows.");
    }
}