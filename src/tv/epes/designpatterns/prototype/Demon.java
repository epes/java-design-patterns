package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Demon
 * Created by epes on 4/27/2014.
 */
public class Demon extends Monster {

    public Demon(int health_, int speed_){
        super(health_, speed_, "Demon");
    }

    @Override
    public Monster cloneMonster(){
        return new Demon(health, speed);
    }
}
