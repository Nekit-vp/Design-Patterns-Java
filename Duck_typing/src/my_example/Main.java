package my_example;

public class Main {

    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
        Horse appaloosa = new Appaloosa();
        appaloosa.ride();

        Horse pegasus = new Pegasus();
        pegasus.ride();
//      pegasus.fly();


//        TypesChecker checker = new TypesChecker();
//        System.out.println(checker.is_equal(Bird.class, Pegasus.class));
//        if (checker.is_equal(Bird.class, Pegasus.class)) {
//            try {
//                Method fly = pegasus.getClass().getDeclaredMethod("fly");
//                fly.invoke(pegasus);
//            } catch (NoSuchMethodException |
//            InvocationTargetException |
//            IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }

//        birdAccept(pegasus);


        Bird pegasus_bird = new BirdProxy(pegasus);
        pegasus_bird.fly();

        horseAccept(pegasus);
        birdAccept(pegasus_bird);
    }

    public static void birdAccept(Bird bird) {
        bird.fly();
    }

    public static void horseAccept(Horse horse) {
        horse.ride();
    }
}
