package MyAdapter;

// Разделяют два вида адаптеров — Object Adapter (адаптер на уровне объекта)
// и Class Adapter (адаптер на уровне класса).

public class TestAdapter {
    public static void main(String[] args) {

        RandomGeneratorAdapter adapter = new RandomGeneratorAdapter();
        SequenceGenerator generator = new SequenceGenerator(adapter);

        for (int i : generator.generate(10)) {
            System.out.print(i + " ");
        }
    }
}
