package tv.epes.designpatterns.flyweight;

import java.util.Random;

/**
 * java-design-patterns
 * tv.epes.designpatterns.flyweight.World
 * Created by epes on 4/27/2014.
 */
public class World {

    private final Terrain grassTerrain;
    private final Terrain hillTerrain;
    private final Terrain riverTerrain;
    /*
        Don't need to create all at once, can create a Flyweight map
        to hold/create/return an instance of Flyweight as needed.
     */

    private final int WIDTH;
    private final int HEIGHT;
    private final Terrain[][] tiles;

    private final Random generator;

    public World() {

        grassTerrain = new Terrain(1, false, '#');
        hillTerrain = new Terrain(3, false, '^');
        riverTerrain = new Terrain(1, true, '=');

        WIDTH = 64;
        HEIGHT = 64;
        tiles = new Terrain[WIDTH][HEIGHT];

        generator = new Random();

        generateTerrain();
    }

    private void generateTerrain() {
        for (int x = 0; x < WIDTH; ++x) {
            for (int y = 0; y < HEIGHT; ++y) {
                if (generator.nextInt(10) == 0) {
                    tiles[x][y] = hillTerrain;
                } else {
                    tiles[x][y] = grassTerrain;
                }
            }
        }

        int x = generator.nextInt(WIDTH);
        for (int y = 0; y < HEIGHT; ++y) {
            tiles[x][y] = riverTerrain;
        }
    }

    public Terrain getTile(int x_, int y_){
        return tiles[x_][y_];
    }

    public int getWidth(){
        return WIDTH;
    }

    public int getHeight(){
        return HEIGHT;
    }
}
