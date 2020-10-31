package factory;

import factory.classes.PaymentFactory;
import factory.enums.PaymentOptions;

/*
 * Author : Vijay Sharma 31-10-2020
 */

/*
    Payment Method module can be designed by using Factory Design pattern

        PaymentFactory => Responsible for creating various payment mode objects
        CashPayment => Concrete implementation for cash payment and processing
        CreditCardPayment => Concrete implementation for CC payment and processing
        UPIPayment => Concrete implementation for UPI payment and processing

        PaymentOptions => enum to define multiple payment options

        Payment => generic payment interface can be implemented by any payment mode class.

        Advantages = SOLID, Maintainable
                     Easy to modify and extend if more PaymentModes are introduced in future.
 */

public class Main {

    public static void main(String[] args) {

        PaymentOptions option = PaymentOptions.UPI;
        PaymentFactory.getPaymentMode(option).pay();
    }
}
