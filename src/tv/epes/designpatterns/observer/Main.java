package tv.epes.designpatterns.observer;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Main
 * Created by epes on 4/27/2014.
 */
public class Main {
    public static void main(String[] args) {
        final Entity entity = new Entity(true);
        Achievements achievements = new Achievements();
        Physics physics = new Physics();

        // Achievements now receives notifications from Physics
        physics.addObserver(achievements);

        physics.fall(entity);
    }
}
