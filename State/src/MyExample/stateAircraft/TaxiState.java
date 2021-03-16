package MyExample.stateAircraft;

import MyExample.F16;
import MyExample.IPilotActions;

public class TaxiState implements IPilotActions {
    F16 f16;

    public TaxiState(F16 f16) {
        this.f16 = f16;
    }

    public void pilotTaxies(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    public void pilotFlies(F16 f16) {
        System.out.println("Transition to airborne state");
        this.f16.setState(f16.getAirborneState());
    }

    public void pilotEjects(F16 f16) {
        // we can change the state to ejectState or crashState
        this.f16.setState(f16.getEjectsState());
    }

    public void pilotLands(F16 f16) {
        System.out.println("This is an invalid operation for this state");
    }

    public void pilotParks(F16 f16) {
        this.f16.setState(f16.getParkedState());
    }
}