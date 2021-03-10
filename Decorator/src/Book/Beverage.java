package Book;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description ="Unknown beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }
}
