package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Sorcerer
 * Created by epes on 4/27/2014.
 */
public class Sorcerer extends Monster {

    public Sorcerer(int health_, int speed_){
        super(health_, speed_, "Sorcerer");
    }

    @Override
    public Monster cloneMonster(){
        return new Sorcerer(health, speed);
    }
}
