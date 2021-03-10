package Additional;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextIterator implements Iterator {


    private Scanner scanner;
    private FileReader fileReader;
    private String string;

    TextIterator(String fileName) {
        try {
            fileReader = new FileReader(new File("src/Additional/" + fileName));
            scanner = new Scanner(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            e.printStackTrace();
        }
    }

    @Override
    public boolean hasNext() {
        while (scanner.hasNext()){
            string = scanner.nextLine();
            return (!string.substring(0,2).equals("//"));
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String next() {
        return string;
    }


}
