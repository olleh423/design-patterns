package strategy.abstractClasses;

import strategy.interfaces.Refillable;
import strategy.interfaces.Repairable;

/*
 * Author : Vijay Sharma 29-10-2020
 */
public abstract class Soldier {

    protected Repairable repairable;
    protected Refillable refillable;

    public abstract void attack();

    public void setRepairBehaviour(Repairable repairBehaivour) {
        this.repairable = repairBehaivour;
    }

    public Repairable getRepairBehaviour() {
        return this.repairable;
    }

    public void setRefillBehaviour(Refillable refillBehaivour) {
        this.refillable = refillBehaivour;
    }

    public Refillable getRefillBehaviour() {
        return this.refillable;
    }
}
