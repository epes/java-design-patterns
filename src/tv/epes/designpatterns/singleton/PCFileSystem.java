package tv.epes.designpatterns.singleton;

/**
 * java-design-patterns
 * tv.epes.designpatterns.singleton.PCFileSystem
 * Created by epes on 4/28/2014.
 */
public class PCFileSystem extends FileSystem {

    public PCFileSystem(){
        super();
    }

    @Override
    public String readFile(String filepath_){
        System.out.println("Reading file with PCFileSystem at " + filepath_);
        return "";
    }

    @Override
    public void writeFile(String filepath_, String contents_){
        System.out.println("Writing file with PCFileSystem at " + filepath_);
    }
}
