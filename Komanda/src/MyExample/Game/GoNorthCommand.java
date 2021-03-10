package MyExample.Game;

public class GoNorthCommand extends StepsCommand{
    @Override
    public void execute() {
        steps.goNorth();
    }
}
