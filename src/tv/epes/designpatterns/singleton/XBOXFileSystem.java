package tv.epes.designpatterns.singleton;

/**
 * java-design-patterns
 * tv.epes.designpatterns.singleton.XBOXFileSystem
 * Created by epes on 4/28/2014.
 */
public class XBOXFileSystem extends FileSystem {

    public XBOXFileSystem(){
        super();
    }

    @Override
    public String readFile(String filepath_){
        System.out.println("Reading file with XBOXFileSystem at " + filepath_);
        return "";
    }

    @Override
    public void writeFile(String filepath_, String contents_){
        System.out.println("Writing file with XBOXFileSystem at " + filepath_);
    }
}