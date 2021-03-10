package MyExample.Game;

import java.util.LinkedList;
import java.util.List;

public class Navigator {

    private final List<StepsCommand> steps = new LinkedList<>();
    private final List<StepsCommand> path = new LinkedList<>();

    public Navigator registerStep(StepsCommand step) {
        steps.add(step);
        return this;
    }

    public void go() {
        for(StepsCommand step : steps) {
            step.execute();
            ((LinkedList)path).addFirst(step);
        }
        steps.clear();
    }

    public void goBack() {
        for(StepsCommand step : path) {
            step.execute();
        }
        path.clear();
    }
}
