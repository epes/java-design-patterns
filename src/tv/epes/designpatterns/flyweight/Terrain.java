package tv.epes.designpatterns.flyweight;

/**
 * java-design-patterns
 * tv.epes.designpatterns.flyweight.Terrain
 * Created by epes on 4/27/2014.
 */
public class Terrain {

    /**
     * Context-less Terrain class containing no specifics about an individual tile.
     */

    private char texture;
    private int movementCost;
    private boolean isWater;

    public Terrain(int movementCost_, boolean isWater_, char texture_){
        this.movementCost = movementCost_;
        this.isWater = isWater_;
        this.texture = texture_;
    }

    // to be replaced by an actual texture which is reused to save memory
    public char getTexture(){
        return texture;
    }

    public int getMovementCost(){
        return movementCost;
    }

    public boolean isWater(){
        return isWater;
    }
}
