package MyExample.stateAircraft;

import MyExample.F16;
import MyExample.IPilotActions;

public class EjectState implements IPilotActions {
    F16 f16;

    public EjectState(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotEjects(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    @Override
    public void pilotFlies(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    @Override
    public void pilotLands(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    @Override
    public void pilotParks(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    @Override
    public void pilotTaxies(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

}