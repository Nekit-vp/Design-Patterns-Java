package CompositionAndInheritance;

//адаптер с использованием наследования

public class CylindricalSocket {
    public String supply(String cylinderItem1, String cylinderItem2) {
        return "Power power power...";
    }
}

class RectangularAdapter extends CylindricalSocket {
    public String adapt(String rectangleItem1, String rectangleItem2) {
        //some conversion logic
        String cylinderItem1 = rectangleItem1;
        String cylinderItem2 = rectangleItem2;
        return supply(cylinderItem1, cylinderItem2);
    }
}

class RectangularPlug {

    public RectangularPlug(String rectangleItem1, String rectangleItem2) {
        this.rectangleItem1 = rectangleItem1;
        this.rectangleItem2 = rectangleItem2;
    }

    private String rectangleItem1;
    private String rectangleItem2;
    public void getPower() {
        RectangularAdapter adapter = new RectangularAdapter();
        String power = adapter.adapt( rectangleItem1,  rectangleItem2);
        System.out.println( power);
    }
}

class Test{
    public static void main(String[] args) {
        RectangularPlug rectangularPlug = new RectangularPlug("10", "20");
        rectangularPlug.getPower();
    }
}