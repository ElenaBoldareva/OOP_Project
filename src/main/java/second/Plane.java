package second;

public class Plane implements PlaneInterface {

    private final int flight;

    public Plane(int flight) {
        this.flight = flight;
    }

    public int getFlight() {
        return flight;
    }

    @Override
    public void takeOff() {
        System.out.println("Flight " + flight + " is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Flight " + flight + " is landing.");
    }

    @Override
    public void queryLanding() {
        System.out.println("Flight " + flight + " query to land.");
    }

    @Override
    public void queryTakingOff() {
        System.out.println("Flight " + flight + " query to take off.");
    }


}
