package strategy;

import strategy.abstractClasses.Soldier;
import strategy.classes.Archer;
import strategy.classes.ExternalRepair;
import strategy.classes.IronMan;
import strategy.interfaces.Repairable;

/*
 * Author : Vijay Sharma 29-10-2020
 */

/*
    Strategy Pattern :
        We are designing Fighter Prototype
        fighters : SwordMan, Gunman, IronMan, Archer
        Behaviours : Attack (Mandatory) , Refill (Optional) , Repair (Optional)
            SwordMan : No need to repair and refill
            GunMan : No need to repair but refill based on time
            IronMan : Need to repair with self repair behaivour but no need to refill weapon
            Archer : No need to repair but refill based on weapon
 */

public class Main {

    public static void main(String[] args) {

        Soldier ironMan = new IronMan();
        Soldier archer = new Archer();

        ironMan.attack();
        ironMan.getRefillBehaviour().refill();
        archer.attack();
        archer.getRefillBehaviour().refill();
        archer.getRepairBehaviour().repair();

        Repairable repairBehaviour = new ExternalRepair();
        ironMan.setRepairBehaviour(repairBehaviour);

        ironMan.attack();
        ironMan.getRepairBehaviour().repair();
    }
}
