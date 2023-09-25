package second;

import java.util.ArrayList;
import java.util.List;

public class Airport implements AirportInterface {

    private int capacity;
    private int airstripCount;
    private List<Plane> planes = new ArrayList<>();

    public Airport(int capacity, int airstripCount) {
        this.capacity = capacity;
        this.airstripCount = airstripCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAirstripCount() {
        return airstripCount;
    }

    public void setAirstripCount(int airstripCount) {
        this.airstripCount = airstripCount;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    @Override
    public void addPlane(Plane plane) {
        if (planes.size() == capacity) {
            System.out.println("The airport capacity is full.");
        } else {
            planes.add(plane);
        }
    }

    @Override
    public void removePlane(Plane plane) {
        planes.remove(plane);
    }

    @Override
    public void printState() {
        System.out.println("Airport state: capacity is " + capacity + "; busy " + planes.size() + " places.");
    }
}
