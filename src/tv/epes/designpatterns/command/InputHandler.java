package tv.epes.designpatterns.command;

/**
 * design-patterns
 * tv.epes.designpatterns.command.InputHandler
 * Created by epes on 4/27/2014.
 */
public class InputHandler {

    private Command buttonA;
    private Command buttonB;
    private Command buttonX;
    private Command buttonY;
    private Command[] commands;

    /**
     * This initialization allows for command re-binding.
     */
    public InputHandler(){
        commands = new Command[]{new JumpCommand(), new MeleeCommand(), new CrouchCommand(), new ShootCommand()};
        buttonA = commands[0];
        buttonB = commands[1];
        buttonX = commands[2];
        buttonY = commands[3];
    }

    /**
     * Called once each frame to detect input.
     * @return Command corresponding to the pressed key.
     */
    public Command handleInput(char char_){
        /*
        Key-Listener usually goes here, replaced by parameter
        passed in from console.
         */
        if(char_ == 'a') return buttonA;
        if(char_ == 'b') return buttonB;
        if(char_ == 'x') return buttonX;
        if(char_ == 'y') return buttonY;
        return null;
    }
}
