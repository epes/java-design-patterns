package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Spawner
 * Created by epes on 4/27/2014.
 */
public class Spawner {

    private Monster prototype;

    public Spawner(Monster prototype_){
        prototype = prototype_;
    }

    public Monster spawnMonster(){
        return prototype.cloneMonster();
    }
}
