package factory.classes;

import factory.interfaces.Payment;

/*
 * Author : Vijay Sharma 31-10-2020
 */
public class CreditCardPayment implements Payment {

    @Override
    public void pay() {

        System.out.println("Paid via Credit Card");
    }
}
