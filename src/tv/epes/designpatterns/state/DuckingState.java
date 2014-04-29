package tv.epes.designpatterns.state;

/**
 * java-design-patterns
 * tv.epes.designpatterns.state.DuckingState
 * Created by epes on 4/28/2014.
 */
public class DuckingState implements HeroState{

    private int chargeTime;
    private final int MAX_CHARGE;

    public DuckingState(){
        chargeTime = 0;
        MAX_CHARGE = 2;
    }

    @Override
    public void handleInput(Hero hero_, Input input_){
        if(input_ == Input.RELEASE_DOWN){
            hero_.changeState(new StandingState());
        }
    }

    @Override
    public void update(Hero hero_){
        ++chargeTime;
        if(chargeTime > MAX_CHARGE){
            hero_.superBomb();
        }
    }

    @Override
    public void enter(Hero hero_){
        chargeTime = 0;
        hero_.setGraphics("DUCKING");
    }

    @Override
    public void exit(Hero hero_){

    }
}

