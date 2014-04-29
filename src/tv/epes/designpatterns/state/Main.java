package tv.epes.designpatterns.state;

/**
 * java-design-patterns
 * tv.epes.designpatterns.state.Main
 * Created by epes on 4/28/2014.
 */
public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.handleInput(Input.PRESS_DOWN); //Ducks
        hero.update();
        hero.handleInput(Input.NO_INPUT);
        hero.update();
        hero.handleInput(Input.RELEASE_DOWN); //Stands
        hero.update();
        hero.handleInput(Input.PRESS_DOWN); //Ducks
        hero.update();
        hero.handleInput(Input.NO_INPUT);
        hero.update();
        hero.handleInput(Input.NO_INPUT);
        hero.update(); //superBomb() activates after ducking for 3 updates
    }
}
