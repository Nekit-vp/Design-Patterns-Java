package CompositionAndInheritance;

public class CylindricalSocket2 {
    public String supply(String cylinStem1, String cylinStem2) {
        return "Power power power...";
    }
}

class RectangularAdapter2 {
    private CylindricalSocket socket;//используем композицию

    public String adapt(String rectaStem1, String rectaStem2) {
        //some conversion logic
        socket = new CylindricalSocket();
        String cylinStem1 = rectaStem1;
        String cylinStem2 = rectaStem2;
        return socket.supply(cylinStem1, cylinStem2);
    }
}

class RectangularPlug2 {
    public RectangularPlug2(String rectaStem1, String rectaStem2) {
        this.rectaStem1 = rectaStem1;
        this.rectaStem2 = rectaStem2;
    }
    private String rectaStem1;
    private String rectaStem2;

    public void getPower() {
        RectangularAdapter adapter = new RectangularAdapter();
        String power = adapter.adapt(rectaStem1, rectaStem2);
        System.out.println(power);
    }
}

class Test2{
    public static void main(String[] args) {
        RectangularPlug2 rectangularPlug = new RectangularPlug2("10","20");
        rectangularPlug.getPower();

    }
}