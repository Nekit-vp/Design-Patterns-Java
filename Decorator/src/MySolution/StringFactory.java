package MySolution;

public abstract class StringFactory {

    public Line orderStringLine(int number, String text){
        Line line;

        line = createLine(number, text);

        System.out.println(line.getStringLine());

        return line;

    }

    public abstract Line createLine(int number, String text);
}

class BracketFactory extends StringFactory{
    @Override
    public Line createLine(int number, String text) {
        Line line = new Latin(text);
        for (int i = 0; i < number; i++) {
            line = new bracket(line);
        }

        return line;
    }
}

class DollarFactory extends StringFactory{

    @Override
    public Line createLine(int number, String text) {
        Line line = new Latin(text);
        for (int i = 0; i < number; i++) {
            line  = new dollar(line);
        }
        return line;
    }
}

class StarFactory extends  StringFactory{

    @Override
    public Line createLine(int number, String text) {
        Line line = new Latin(text);
        for (int i = 0; i < number; i++) {
            line = new star(line);
        }
        return line;
    }

}
