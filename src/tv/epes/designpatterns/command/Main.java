package tv.epes.designpatterns.command;

import java.util.Scanner;

/**
 * design-patterns
 * tv.epes.designpatterns.command.Main
 * Created by epes on 4/27/2014.
 */
public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor("Player1");
        InputHandler handler = new InputHandler();
        Scanner in = new Scanner(System.in);
        Command command;


        boolean flag = true;
        char input;

        System.out.println("Choose a command (x y b a)");
        while(flag){
            input = in.next().charAt(0);

            command = handler.handleInput(input);
            if(command != null){
                command.execute(actor);
            }

            if(input == '0')
                flag = false;
        }
    }
}
