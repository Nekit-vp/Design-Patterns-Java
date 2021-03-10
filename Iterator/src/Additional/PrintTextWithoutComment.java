package Additional;

public class PrintTextWithoutComment {
    public static void main(String[] args) {
        Iterator iterator = new TextIterator("Text.txt");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
