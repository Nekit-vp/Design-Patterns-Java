package NewMyAdapter;

public class AudiA3 implements BasicCar {
    final public int light = 100;

    @Override
    public void drive(){
        System.out.println("AudiA3 rides!");
    }

    @Override
    public void xenonOn(){
        System.out.println("AudiA3 xenon on ");
    }

    @Override
    public void xenonOff(){
        System.out.println("AudiA3 xenon off");
    }
}
