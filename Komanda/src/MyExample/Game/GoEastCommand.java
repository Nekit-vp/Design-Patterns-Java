package MyExample.Game;

public class GoEastCommand extends StepsCommand{
    @Override
    public void execute() {
        steps.goEast();
    }
}
