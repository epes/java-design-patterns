package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Ghost
 * Created by epes on 4/27/2014.
 */
public class Ghost extends Monster {

    public Ghost(int health_, int speed_){
        super(health_, speed_, "Ghost");
    }

    @Override
    public Monster cloneMonster(){
        return new Ghost(health, speed);
    }
}
