package tv.epes.designpatterns.state;

/**
 * java-design-patterns
 * tv.epes.designpatterns.state.StandingState
 * Created by epes on 4/28/2014.
 */
public class StandingState implements HeroState{

    @Override
    public void handleInput(Hero hero_, Input input_){
        if(input_ == Input.PRESS_DOWN){
            hero_.changeState(new DuckingState());
        }
    }

    @Override
    public void update(Hero hero_){

    }

    @Override
    public void enter(Hero hero_){
        hero_.setGraphics("STANDING");
    }

    @Override
    public void exit(Hero hero_){

    }
}
