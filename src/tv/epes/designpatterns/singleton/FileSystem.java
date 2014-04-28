package tv.epes.designpatterns.singleton;

import tv.epes.designpatterns.singleton.Platform;

/**
 * java-design-patterns
 * tv.epes.designpatterns.singleton.FileSystem
 * Created by epes on 4/28/2014.
 */
public abstract class FileSystem {

    /* If you're using a Singleton, try to exhaust other possibilities first! */

    //single instance of a FileSystem
    //global access to the instance

    private static FileSystem instance;

    protected FileSystem(){
        //initial setups same to all platforms here
    }

    public abstract String readFile(String filepath_);
    public abstract void writeFile(String filepath_, String contents_);

    public static FileSystem getInstance(){
        if(instance == null){

            Platform platform = Platform.PC; //normally have other way to detect platform

            switch(platform){
                case PC: instance = new PCFileSystem();
                        break;
                case PS3: instance = new PS3FileSystem();
                        break;
                case XBOX: instance = new XBOXFileSystem();
                        break;
            }
        }
        return instance;

    }
}
