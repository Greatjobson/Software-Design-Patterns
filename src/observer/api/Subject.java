package observer.api;

import bridge.model.Warrior;

public interface Subject {
    void addObserver(Warrior observer);
    void removeObserver(Warrior observer);
    void notifyObservers(String news);
}