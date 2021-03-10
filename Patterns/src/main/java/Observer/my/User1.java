package Observer.my;

public class User1 implements Observer, DisplayElement {

    private Subject chatRoom;
    private int number;
    private String news;

    public User1(Subject subject){
        this.chatRoom = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int number, String news) {
        this.number = number;
        this.news = news;
        display();
    }

    @Override
    public void display() {
        System.out.println("Новые сообщения: номер сообщения: " + number + ". сообщение: " + news  + " | user1 ");
    }
}
