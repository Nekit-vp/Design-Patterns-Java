package Strategy.my;

public class NoBip implements BipBehavior {
    @Override
    public void bip() {
        System.out.println(" I am not bip");
    }
}
