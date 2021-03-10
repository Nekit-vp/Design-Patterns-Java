package MySolution;

public class TestStringLine {
    public static void main(String[] args) {
        StringFactory factory = new StarFactory();
        ;

        StringFactory factory1 = new DollarFactory();
        factory1.orderStringLine(2, factory.orderStringLine(5, "мама").getStringLine());


    }
}
