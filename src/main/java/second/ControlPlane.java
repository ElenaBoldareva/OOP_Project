package second;

import java.util.Random;
import java.util.Scanner;

public class ControlPlane {

    private Airport airport;
    Random random = new Random();
    public void start() {
        airport = new Airport(10, 1);
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!"stop".equals(command)) {

            if (isQueryToLand()) {
                Plane plane = createPlane();
                plane.queryLanding();
                airport.printState();
                command = scanner.nextLine();

                if (command.equals("land")) {
                    plane.land();
                    airport.addPlane(plane);
                } else if (command.equals("stop")) {
                    return;
                } else {
                    System.out.println("Unknown command " + command);
                    continue;
                }
            }

            if (isQueryToTakeOff()) {
                int index = random.nextInt(airport.getPlanes().size());
                Plane plane = airport.getPlanes().get(index);
                plane.queryTakingOff();
                airport.printState();
                command = scanner.nextLine();

                if (command.equals("take off")) {
                    plane.takeOff();
                    airport.removePlane(plane);
                } else if (command.equals("stop")) {
                    return;
                } else {
                    System.out.println("Unknown command " + command);
                    continue;
                }
            }
        }
    }

    private boolean isQueryToTakeOff() {
        if (airport.getPlanes().isEmpty()) {
            return false;
        }
        return random.nextBoolean();
    }

    private Plane createPlane() {
        int flight = random.nextInt(10000);
        Plane plane = new Plane(flight);
        return plane;
    }

    private boolean isQueryToLand() {
        return random.nextBoolean();
    }
}
