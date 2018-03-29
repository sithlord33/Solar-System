package solar_system;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class BallApplet extends Applet {
    protected Dimension dim;
    public Timer timer;

    private int x, y;
    private int dx = 2, dy = 4;
    private int radius = 20;
    private Color color = Color.GREEN;

    public void init() {
        dim = getSize();
        x = dim.width / 2;
        y = dim.height / 2;
        timer = new Timer(100, event -> repaint());
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, dim.width, dim.height);
        g.setColor(color);
        g.fillOval(x-radius,y-radius,radius*2,radius*2);
    }

    public void start(){timer.start();}

    public void stop(){timer.stop();}
}