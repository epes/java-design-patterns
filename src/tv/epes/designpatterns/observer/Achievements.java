package tv.epes.designpatterns.observer;

import java.util.ArrayList;

/**
 * java-design-patterns
 * tv.epes.designpatterns.observer.Achievements
 * Created by epes on 4/27/2014.
 */
public class Achievements implements Observer {

    private enum Achievement{
        FELL_OFF_BRIDGE;
    }

    private final ArrayList<Achievement> achievements;

    public Achievements(){
        achievements = new ArrayList<Achievement>();
    }

    @Override
    public void onNotify(final Entity entity_, Event event_){
        switch(event_){
            case ENTITY_FELL:
                if(entity_.isHero()){
                    unlock(Achievement.FELL_OFF_BRIDGE);
                }
        }
    }

    private void unlock(Achievement achievement_){
        if(!achievements.contains(achievement_)){
            achievements.add(achievement_);
            System.out.println("ACHIEVEMENT UNLOCKED! " + achievement_.name());
        }
    }
}
