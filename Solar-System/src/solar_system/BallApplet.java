package solar_system;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class BallApplet extends Applet {
    protected Dimension dim = new Dimension(1000, 1000);
    public Timer timer;

    public void init() {
        setSize(dim);
        timer = new Timer(100, event -> repaint());
    }

    public void paint(Graphics g) {
     	g.setColor(Color.BLACK);
     	g.fillRect(0, 0, dim.width, dim.height);
    }

    public void start(){timer.start();}

    public void stop(){timer.stop();}
}