package tv.epes.designpatterns.state;

/**
 * java-design-patterns
 * tv.epes.designpatterns.state.Hero
 * Created by epes on 4/28/2014.
 */
public class Hero {

    private String graphics;
    private HeroState state;
    private HeroState equipment; //implement separate states for weapons

    public Hero(){
        state = new StandingState();
    }

    public void handleInput(Input input_){
        state.handleInput(this, input_);
        //equipment.handleInput(this, input_);
    }

    public void update(){
        state.update(this);
    }

    public void setGraphics(String graphics_){
        //this shouldn't be a String but I'm too lazy to load images
        System.out.println("Current graphic state: " + graphics_);
        graphics = graphics_;
    }

    public void superBomb(){
        System.out.println("BOOOOOOOOOOOOOOM!");
    }

    public void changeState(HeroState state_){
        state.exit(this);
        state = state_;
        state.enter(this);
    }
}
