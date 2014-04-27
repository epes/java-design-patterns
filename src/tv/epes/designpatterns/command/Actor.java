package tv.epes.designpatterns.command;

/**
 * java-design-patterns
 * tv.epes.designpatterns.command.Actor
 * Created by epes on 4/27/2014.
 */
public class Actor {

    private String name;

    public Actor(String name_){
        name = name_;
    }

    public void jump(){
        System.out.println(name + " jumped!");
    }

    public void crouch(){
        System.out.println(name + " crouched!");
    }

    public void melee(){
        System.out.println(name + " meleed!");
    }

    public void shoot(){
        System.out.println(name + " shot!");
    }
}
