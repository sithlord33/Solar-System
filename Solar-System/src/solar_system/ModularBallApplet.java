package solar_system;

import java.awt.*;

public class ModularBallApplet extends BallApplet {
    private Ball ball;

    public void init() {
        super.init();
        ball = createBall();
    }

    protected Ball createBall() {
        return new BouncingBall(dim);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
        ball.draw(g);
    }
}
