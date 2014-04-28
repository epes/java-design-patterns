package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Monster
 * Created by epes on 4/27/2014.
 */
public abstract class Monster{

    protected int health;
    protected int speed;
    protected String name;

    public Monster(int health_, int speed_, String name_){
        health = health_;
        speed = speed_;
        name = name_;
    }

    public int getHealth(){
        return health;
    }

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    abstract Monster cloneMonster();
}
