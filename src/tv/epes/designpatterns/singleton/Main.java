package tv.epes.designpatterns.singleton;

/**
 * java-design-patterns
 * tv.epes.designpatterns.singleton.Main
 * Created by epes on 4/28/2014.
 */
public class Main {

    /**
     * Think twice, or three times, about using a Singleton.
     * There are ways to avoid it in different situations.
     *
     * Object Managers:
     *  Usually not necessary in most cases and can move the
     *  'management' code into the object itself. //ex: move(), create()
     *
     * Single Instance but NOT Global Access:
     *  'instantiated' boolean flag on instantiation to prevent
     *  multiple instances. Have to make sure to pass the single
     *  instance around to those who need it.
     *
     * Convenient Access:
     *  Pass the instance in as an argument.
     *  OR
     *  Hold the instance at the root of the hierarchy
     *  in the base class.
     *
     * Global Access:
     *  Hold the instance in something that is already global.
     *  //ex: World, Game
     *
     * In the end you could always just make it a static.
     */

    public static void main(String[] args) {
        //currently the platform is set to PC in FileSystem::getInstance()
        FileSystem.getInstance().readFile("*somefilepath*");
    }
}
