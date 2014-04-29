package tv.epes.designpatterns.state;

/**
 * java-design-patterns
 * tv.epes.designpatterns.state.HeroineState
 * Created by epes on 4/28/2014.
 */
public interface HeroState {
    public void handleInput(Hero hero_, Input input_);
    public void update(Hero hero_);
    public void enter(Hero hero_);
    public void exit(Hero hero_);
}
