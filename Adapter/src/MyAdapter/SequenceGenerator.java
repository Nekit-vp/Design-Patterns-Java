package MyAdapter;

public class SequenceGenerator {

    private Generator generator;

    public SequenceGenerator(Generator generator) {
        this.generator = generator;
    }

    public int[] generate(int length) {
        int ret[] = new int[length];

        for (int i=0; i<length; i++) {
            ret[i] = generator.next();
        }

        return ret;
    }
}
