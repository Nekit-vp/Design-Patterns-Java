package NewMyAdapter;

public class AudiA3Rus implements BasicCarRus{
    final public int light = 50;

    @Override
    public void drive(){
        System.out.println("AudiA3Rus rides!");
    }

    @Override
    public void basicLightOn(){
        System.out.println("AudiA3Rus basic light on");
    }

    @Override
    public void basicLightOff(){
        System.out.println("AudiA3Rus basic light off");
    }
}
