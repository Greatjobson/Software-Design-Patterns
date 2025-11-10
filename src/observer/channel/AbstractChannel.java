package observer.channel;

import bridge.model.Warrior;
import observer.api.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChannel implements Subject {
    private final List<Observer> observers = new ArrayList<>();
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
//        for (Observer o : observers) {
//            o.update(news);
//        }
        for (int i = observers.size() - 1;i >= 0;i--){
            observers.get(i).update(news);
        }

    }
}
