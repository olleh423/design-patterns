package factory.classes;

import factory.enums.PaymentOptions;
import factory.interfaces.Payment;

/*
 * Author : Vijay Sharma 31-10-2020
 */
public class PaymentFactory {

    public static Payment getPaymentMode(PaymentOptions option) {

        if(option == PaymentOptions.CASH)
            return new CashPayment();

        if(option == PaymentOptions.CREDIT_CARD)
            return new CreditCardPayment();

        if(option == PaymentOptions.UPI)
            return new UPIPayment();

        return null;
    }
}
