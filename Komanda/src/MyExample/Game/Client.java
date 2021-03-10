package MyExample.Game;

public class Client {
    public static void main(String[] args) {
        Navigator navigator =
                new Navigator().registerStep(new GoEastCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoSouthCommand());
        System.out.println("go");
        navigator.go();
        System.out.println("go back");
        navigator.goBack();
    }
}
