package MyExample.Game;

public class GoSouthCommand extends StepsCommand{
    @Override
    public void execute() {
        steps.goSouth();
    }
}
