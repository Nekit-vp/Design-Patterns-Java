package NewMyAdapter;

public class Example {
    public static void main(String[] args){
        //создаем объект машины
        BasicCar audiA3 = new AudiA3();
        //создаем объект процессора и передаем ему в управления объект машины
        CentralProcessor cp = new CentralProcessor(audiA3);
        //процессор управляет работой машины
        cp.work();

        //cсоздаем адаптер и передаем в него машину
        CarAdapter audiA3Rus = new CarAdapter(new AudiA3Rus());
        //создаем процессор и передаем в него адаптер
        CentralProcessor cpRus = new CentralProcessor(audiA3Rus);
        //процессор управляет машиной
        cpRus.work();
    }
}
