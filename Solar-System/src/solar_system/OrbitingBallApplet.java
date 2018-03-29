package solar_system;

public class OrbitingBallApplet extends ModularBallApplet {
    protected Ball createBall() {
        return new OrbitingBall(dim);
    }
}