package strategy.classes;


import strategy.abstractClasses.Soldier;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public class IronMan extends Soldier {

    public IronMan() {
        setRefillBehaviour(new NoRefill());
        setRepairBehaviour(new InternalRepair());
    }

    public void attack() {
        System.out.println("Attacking by multiple weapon with unlimited supplies.");
    }
}