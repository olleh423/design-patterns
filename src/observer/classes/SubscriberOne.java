package observer.classes;

import observer.interfaces.Subject;
import observer.interfaces.Subscriber;

/*
 * Author : Vijay Sharma 30-10-2020
 */
public class SubscriberOne implements Subscriber {

    private Subject subject;

    public SubscriberOne(Subject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Subscriber One received Updates : " + message);
    }
}
