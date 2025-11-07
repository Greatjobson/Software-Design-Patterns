package observer.channel;

import bridge.model.Warrior;
import observer.api.Observer;
import observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

public class MessageChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Warrior observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Warrior observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }


    public void publishNews(String news) {
        System.out.println("\n======================================");
        System.out.println("[NEWS]: " + news);
        System.out.println("======================================");
        notifyObservers(news);
    }
}
