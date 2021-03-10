package Observer.my;

import java.util.ArrayList;

public class ChatRoom implements Subject, DisplayElement{

    private ArrayList observers;
    private int number;
    private String news;

    public ChatRoom(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for  (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(number, news);
        }
    }

    public void Changed(){
        notifyObservers();
    }

    public void setNewsMessage(int number, String news){
        this.number = number;
        this.news = news;
        Changed();
    }

    @Override
    public void display() {
        System.out.println("Новые сообщения: номер сообщения: " + number + ". Сообщение: " + news);
    }
}
