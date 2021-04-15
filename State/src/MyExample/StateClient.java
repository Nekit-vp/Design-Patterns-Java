package MyExample;

public class StateClient {

    public static void main(String[] args) {
        F16 f16 = new F16();
        f16.startsEngine();
        f16.fliesPlane();
        f16.ejectsPlane();
        f16.landsPlane();

    }
}