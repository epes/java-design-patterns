package tv.epes.designpatterns.command;

/**
 * design-patterns
 * tv.epes.designpatterns.command.CrouchCommand
 * Created by epes on 4/27/2014.
 */
public class CrouchCommand implements Command{
    @Override
    public void execute(Actor actor) {
        actor.crouch();
    }
}
