package tv.epes.designpatterns.observer;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Physics
 * Created by epes on 4/27/2014.
 */
public class Physics extends Subject{

    public Physics(){
        super();
    }

    public void updateBody(){
        // this is the method that would be called once per frame
    }

    public void fall(Entity entity_){
        // this is a made up method to demonstrate the notifications
        notify(entity_, Event.ENTITY_FELL);
    }
}
