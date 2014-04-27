package tv.epes.designpatterns.command;

/**
 * design-patterns
 * tv.epes.designpatterns.command.ShootCommand
 * Created by epes on 4/27/2014.
 */
public class ShootCommand implements Command{
    @Override
    public void execute(Actor actor){
        actor.shoot();
    }
}
