package NewNewMyAdapter;

public class Client {
    public static void main(String[] args) {

        Object item = new Item(50);
        item.move(20);
        item.getPosition();
        item.move(-10);
        item.getPosition();

        Object itemAdapter = new ItemAdapter(100.0);
        itemAdapter.move(55.4);
        itemAdapter.getPosition();
        itemAdapter.move(-232.1);
        itemAdapter.getPosition();
    }
}
