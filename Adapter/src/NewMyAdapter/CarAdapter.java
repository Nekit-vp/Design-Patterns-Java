package NewMyAdapter;

public class CarAdapter implements BasicCar {

    BasicCarRus basicCarRus;

    public CarAdapter(BasicCarRus basicCarRus){
        this.basicCarRus = basicCarRus;
    }

    @Override
    public void drive(){
        basicCarRus.drive();
    }

    @Override
    public void xenonOn(){
        basicCarRus.basicLightOn();
    }

    @Override
    public void xenonOff(){
        basicCarRus.basicLightOff();
    }
}
