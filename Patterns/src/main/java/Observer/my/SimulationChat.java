package Observer.my;

public class SimulationChat {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User1 user1 = new User1(chatRoom);
        User2 user2 = new User2(chatRoom);
        Loger loger = new Loger(chatRoom);

        chatRoom.setNewsMessage(1, "Привет");
        chatRoom.setNewsMessage(2,"Добрый день");
        chatRoom.setNewsMessage(3, "Это хорошо");
    }
}
