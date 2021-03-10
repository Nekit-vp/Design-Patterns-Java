package MySolution;

public abstract class BeautifulDecorator extends Line {
    public abstract String getDescription();
}

class star extends BeautifulDecorator {
    @Override
    public String getDescription() {
        return line.getDescription() + ", Звездочка";
    }

    @Override
    public int level() {
        return line.level() + 1;
    }

    public star(Line line) {
        this.line = line;
        this.stringLine = "*" + this.line.getStringLine() + "*";
    }

    public String getLine() {
        return this.stringLine;
    }
}

class bracket extends BeautifulDecorator {
    @Override
    public String getDescription() {
        return line.getDescription() + ", Скобочка";
    }

    public bracket(Line line) {
        this.line = line;
        this.stringLine = "(" + this.line.getStringLine() + ")";
    }

    @Override
    public int level() {
        return line.level() + 1;
    }

    public String getLine() {
        return this.stringLine;
    }
}

class dollar extends BeautifulDecorator {
    @Override
    public String getDescription() {
        return line.getDescription() + ", Доллар";
    }

    public dollar(Line line) {
        this.line = line;
        this.stringLine = "$" + this.line.getStringLine() + "$";
    }

    @Override
    public int level() {
        return line.level() + 1;
    }

    public String getLine() {
        return this.stringLine;
    }
}
