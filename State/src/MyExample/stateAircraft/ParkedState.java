package MyExample.stateAircraft;

import MyExample.F16;
import MyExample.IPilotActions;

public class ParkedState implements IPilotActions {

    F16 f16;

    public ParkedState(F16 f16) {
        this.f16 = f16;
    }

    public void pilotTaxies(F16 f16) {
        System.out.println("Transition to Taxi state");
        this.f16.setState(f16.getTaxiState());
    }

    public void pilotFlies(F16 f16) {
        System.out.println("This is an invalid state.");
    }

    public void pilotEjects(F16 f16) {
        this.f16.setState(f16.getEjectsState());
    }

    public void pilotLands(F16 f16) {
        System.out.println("This is an invalid state");
    }

    public void pilotParks(F16 f16) {
        System.out.println("This is an invalid state");
    }
}