package tv.epes.designpatterns.observer;

import java.util.ArrayList;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Subject
 * Created by epes on 4/27/2014.
 */
public class Subject {
    private final int MAX_OBSERVERS;
    // could be a linked list to reduce object creation
    private final ArrayList<Observer> observers;
    private int numObservers;

    public Subject(){
        MAX_OBSERVERS = 16;
        observers = new ArrayList<Observer>();
        numObservers = 0;
    }

    protected void notify(final Entity entity, Event event){
        for(int i = 0; i < numObservers; ++i){
            observers.get(i).onNotify(entity, event);
        }
    }

    public void addObserver(Observer observer_){
        ++numObservers;
        observers.add(observer_);
    }

    public void removeObserver(Observer observer_){
        --numObservers;
        observers.remove(observer_);
    }
}
