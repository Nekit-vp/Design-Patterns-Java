package Observer.my;

public class User2 implements Observer, DisplayElement {

    private int number;
    private String news;
    private Subject chatRoom;

    public User2(Subject subject){
        this.chatRoom = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Новые сообщения: номер сообщения: " + number + ". Сообщение: " + news + " | User2 ");
    }

    @Override
    public void update(int number, String news) {
        this.number = number;
        this.news = news;
        display();
    }
}
