package tv.epes.designpatterns.command;

/**
 * design-patterns
 * tv.epes.designpatterns.command.JumpCommand
 * Created by epes on 4/27/2014.
 */
public class JumpCommand implements Command {
    @Override
    public void execute(Actor actor){
        actor.jump();
    }
}
