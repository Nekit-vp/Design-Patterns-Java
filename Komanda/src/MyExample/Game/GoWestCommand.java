package MyExample.Game;

public class GoWestCommand extends StepsCommand{
    @Override
    public void execute() {
        steps.goWest();
    }
}
