package observer;

import bridge.model.Warrior;

import java.util.ArrayList;
import java.util.List;

public class OrderChannel implements Subject {
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


    public void publishOrder(String order) {
        System.out.println("\n======================================");
        System.out.println("[ORDER]: " + order);
        System.out.println("======================================");
        notifyObservers(order);
    }
}
