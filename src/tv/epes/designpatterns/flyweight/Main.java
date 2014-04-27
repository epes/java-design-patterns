package tv.epes.designpatterns.flyweight;

/**
 * java-design-patterns
 * tv.epes.designpatterns.flyweight.Main
 * Created by epes on 4/27/2014.
 */
public class Main {
    public static void main(String[] args) {
        World world = new World();

        int width = world.getWidth();
        int height = world.getHeight();

        for(int x = 0; x < width; ++x){
            for(int y = 0; y < height; ++y){
                System.out.print(world.getTile(x, y).getTexture());
            }
            System.out.println();
        }
    }
}
