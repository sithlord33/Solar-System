package solar_system;

import java.awt.*;

public class BouncingBall implements Ball {
    private int x, y;
    private int dx = 2, dy = 4;
    private int radius = 20;
    private Color color = Color.GREEN;
    private Dimension dim;

    BouncingBall(Dimension d) {
        this.dim = d;
        x = dim.width / 2;
        y = dim.height / 2;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
        if (x < radius || x > dim.width - radius)
            dx = -dx;
        if (y < radius || y > dim.height - radius)
            dy = -dy;
        x += dx;
        y += dy;
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
