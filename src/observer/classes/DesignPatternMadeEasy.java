package observer.classes;

import observer.interfaces.Subject;
import observer.interfaces.Subscriber;

import java.util.ArrayList;
import java.util.List;

/*
 * Author : Vijay Sharma 30-10-2020
 */
public class DesignPatternMadeEasy implements Subject {

    private List<Subscriber> subscriberList;
    private String title;

    public DesignPatternMadeEasy() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void register(Subscriber newSubscriber) {
        subscriberList.add(newSubscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        int index = subscriberList.indexOf(subscriber);
        subscriberList.remove(index);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber sub : subscriberList)
            sub.update("New video uploaded to the channel : " + title);
    }

    public void uploadVideo(String videoTitle) {
        this.title = videoTitle;
        notifySubscribers();
    }
}
