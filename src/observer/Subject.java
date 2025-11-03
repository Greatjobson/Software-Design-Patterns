package observer;

import bridge.model.Warrior;

interface Subject {
    void addObserver(Warrior observer);
    void removeObserver(Warrior observer);
    void notifyObservers(String news);
}