package tv.epes.designpatterns.observer;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Observer
 * Created by epes on 4/27/2014.
 */
public interface Observer {
    public void onNotify(final Entity entity_, Event event_);
}
