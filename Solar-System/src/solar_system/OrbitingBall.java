package solar_system;

import java.awt.*;

public class OrbitingBall implements Ball {
    //WRITE YOUR CODE HERE

    private int calX() {
        int center = dim.width / 2;
        return (int) (center + distance * Math.cos(Math.toRadians(angle)));
    }

    private int calY() {
        int center = dim.width / 2;
        return (int) (center + distance * Math.sin(Math.toRadians(angle)));
    }
}
