package MyExample;

import MyExample.stateAircraft.*;

public class F16 implements IAircraft {


    private ParkedState parkedState = new ParkedState(this);
    private CrashState crashState = new CrashState(this);
    private TaxiState taxiState = new TaxiState(this);
    private LandState landState = new LandState(this);
    private AirborneState airborneState = new AirborneState(this);
    private EjectState ejectState = new EjectState(this);

    IPilotActions state;

    public F16() {
        this.state = parkedState;
    }

    public void startsEngine() {
        state.pilotTaxies(this);
    }

    public void fliesPlane() {
        state.pilotFlies(this);
    }

    public void landsPlane() {
        state.pilotLands(this);
    }

    public void ejectsPlane() {
        state.pilotEjects(this);
    }

    public void parksPlane() {
        state.pilotParks(this);
    }

    public void setState(IPilotActions pilotActions) {
        this.state = pilotActions;
    }

    public ParkedState getParkedState() {
        return parkedState;
    }

    public CrashState getCrashState() {
        return crashState;
    }

    public LandState getLandState() {
        return landState;
    }

    public TaxiState getTaxiState() {
        return taxiState;
    }

    public AirborneState getAirborneState() {
        return airborneState;
    }

    public EjectState getEjectsState() {
        return ejectState;
    }
}