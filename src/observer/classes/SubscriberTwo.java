package observer.classes;

import observer.interfaces.Subject;
import observer.interfaces.Subscriber;

/*
 * Author : Vijay Sharma 30-10-2020
 */
public class SubscriberTwo implements Subscriber {

    private Subject subject;

    public SubscriberTwo(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Subscriber Two received Updates : " + message);
    }
}
