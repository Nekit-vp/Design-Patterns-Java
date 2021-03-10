package Observer.my;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Loger implements Observer, DisplayElement {

    private Subject chatRoom;
    private int number;
    private String news;

    public Loger(Subject subject){
        this.chatRoom = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Новые сообщения: номер сообщения: " + number + ". сообщение: " + news  + " | loger 1 ");
    }

    @Override
    public void update(int number, String news) {
        this.number = number;
        this.news = news;
        display();
        addInFile();
    }

    private void addInFile()  {
        File file = new File("E:\\Idea Projects\\JavaProject\\Patterns\\src\\main\\java\\Observer\\my\\data.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(number + " : " + news + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
