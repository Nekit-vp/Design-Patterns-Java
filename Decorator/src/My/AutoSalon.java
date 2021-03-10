package My;

public class AutoSalon {

    public static void main(String[] args) {

        Car lada = new Lada();
        lada = new Spoiler(lada);
        lada = new Turbine(lada);
        lada = new Injection(lada);
        lada = new Spoiler(lada);
        lada = new Turbine(lada);
        lada = new Injection(lada);

        System.out.println(lada.getDescription() + " : " + lada.cost());
        lada = deleteDecorator(lada, Turbine.class);
        System.out.println(lada.getDescription() + " : " + lada.cost());


        Car ford = new Injection(new Spoiler(new Turbine(new Ford())));

        System.out.println(ford.getDescription() + " : " + ford.cost());
        ford = deleteDecorator(ford, Injection.class);
        ford = deleteDecorator(ford, Spoiler.class);
        ford = deleteDecorator(ford, Turbine.class);
        System.out.println(ford.getDescription() + " : " + ford.cost());


    }

    private static Car deleteDecorator(Car machine, Class typeDecorator){
        Car pointerPrev = machine;
        if (!(pointerPrev.car == null)){
            Car pointer = machine.car;
            if (typeDecorator.isInstance(pointerPrev)) {
                return pointerPrev.car;
            } else
                while (! (typeDecorator.isInstance(pointer)) && !(pointer.car == null)) {
                    pointerPrev = pointer;
                    pointer = pointer.car;
                }
            if (typeDecorator.isInstance(pointer))
                pointerPrev.car = pointer.car;
            return machine;
        }
        return machine;
    }
}
