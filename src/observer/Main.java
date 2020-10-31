package observer;

import observer.classes.DesignPatternMadeEasy;
import observer.classes.SubscriberOne;
import observer.classes.SubscriberTwo;

/*
 * Author : Vijay Sharma 30-10-2020
 */

/*
    Observer Pattern : To notify all the Observers when any state changes happen to Subject.

        Example : Youtube Channels Subscription

            Subject => DesignPatternMadeEasy
            Observers => SubscriberOne, SubscriberTwo

         behaviours => register subscriber,
                        unregister subscriber,
                        send update to subscribers when any new video uploaded to the channel.
 */

public class Main {

    public static void main(String[] args) {

        DesignPatternMadeEasy channel = new DesignPatternMadeEasy();
        channel.uploadVideo("Search in Sorted Array");

        SubscriberOne subscriberOne = new SubscriberOne(channel);
        channel.uploadVideo("K th smallest in BST");

        SubscriberTwo subscriberTwo = new SubscriberTwo(channel);
        channel.uploadVideo("Reverse array by K elements");

        channel.unregister(subscriberOne);
        channel.uploadVideo("Merge K Sorted Lists");
    }
}
