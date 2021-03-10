package MySolution;

public abstract class Line {

    Line line;

    String stringLine;

    String description ="Unknown line";

    public String getDescription() {
        return description;
    }

    public String getStringLine() {
        return stringLine;
    }
    public abstract int level();
}

class Latin extends Line{
    @Override
    public int level() {
        return 1;
    }
    public Latin(String s) {
        this.stringLine = s;
        this.description = "Оболочки стороки из латиницы: ";
    }
}

