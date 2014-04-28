package tv.epes.designpatterns.prototype;

/**
 * java-design-patterns
 * tv.epes.designpatterns.prototype.Main
 * Created by epes on 4/27/2014.
 */
public class Main {

    public static void main(String[] args) {
        // Ghost(15, 3) is the prototype for all other ghosts that spawn out of this spawner
        Monster ghostPrototype = new Ghost(15, 3);
        Spawner ghostSpawner = new Spawner(ghostPrototype);

        Monster g = ghostSpawner.spawnMonster();

        System.out.println("Spawned a " + g.getName() + " with " + g.getHealth() + " health and " + g.getSpeed() + " speed.");
    }
}
