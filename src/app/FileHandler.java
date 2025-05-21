package app;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    public String createFile(String strPath){
        Path newFile;
        try{
            newFile = Files.createFile(Path.of(strPath));
        }catch(FileAlreadyExistsException e) {
            return "File already exists!";
        }catch(IOException e) {
            return "Something wrong.";
        }
        return newFile + "created";
    }

    public  String writeToFile(Path path, String content) {
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        return "written into " + path;
    }

    public String readFromFile(String path){

        try {
            return Files.readString(Path.of(path));
        }catch(IOException e) {
            return "something went wrong " + e.getMessage();
        }
    }
}

