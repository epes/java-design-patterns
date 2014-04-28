package tv.epes.designpatterns.singleton;

/**
 * java-design-patterns
 * tv.epes.designpatterns.singleton.PS3FileSystem
 * Created by epes on 4/28/2014.
 */
public class PS3FileSystem extends FileSystem{

    public PS3FileSystem(){
        super();
    }

    @Override
    public String readFile(String filepath_){
        System.out.println("Reading file with PS3FileSystem at " + filepath_);
        return "";
    }

    @Override
    public void writeFile(String filepath_, String contents_){
        System.out.println("Writing file with PS3FileSystem at " + filepath_);
    }
}
