package observer.interfaces;

/*
 * Author : Vijay Sharma 30-10-2020
 */
public interface Subject {
    void register(Subscriber newSubscriber);
    void unregister(Subscriber subscriber);
    void notifySubscribers();
}
