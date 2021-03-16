package MyExample;
//This interface declares the action a pilot can take against aircraft object.
//action will move the aircraft into a different state.

public interface IPilotActions {

    void pilotTaxies(F16 f16);

    void pilotFlies(F16 f16);

    void pilotEjects(F16 f16);

    void pilotLands(F16 f16);

    void pilotParks(F16 f16);
}