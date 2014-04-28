package tv.epes.designpatterns.observer;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Entity
 * Created by epes on 4/27/2014.
 */
public class Entity {

    private final boolean isHero;

    public Entity(boolean isHero_){
        isHero = isHero_;
    }

    public boolean isHero(){
        return isHero;
    }

}
