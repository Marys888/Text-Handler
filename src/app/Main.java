package app;
import java.nio.file.Paths;

public class Main {
    private static final String BASE_PATH = "files/";
    public static void main(String[] args) {
        String fileFormat = ".txt";
        String fileName = "myFile";
        String path = BASE_PATH + fileName + fileFormat;
        String content = "Super Information";

        FileHandler handler = new FileHandler();

        getOutput(handler.createFile(path));
        getOutput(handler.writeToFile(Paths.get(path), content));
        getOutput(handler.readFromFile(path));


    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
