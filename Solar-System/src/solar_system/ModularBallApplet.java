package solar_system;

import java.awt.*;

public class ModularBallApplet extends BallApplet {
    private Ball Sun;    
    private Image image;
	private Graphics offScreen;

    public void init() {
        super.init();
        Sun = createSun();
    }

    protected Ball createSun() {
        return new Sun(dim);
    }
    
    public void update(Graphics g){
    	if (image == null) {
    	    image = createImage(dim.width, dim.height);
    	    offScreen = image.getGraphics();
    	}
    	
    	offScreen.setColor(Color.BLACK);
    	offScreen.fillRect(0, 0, dim.width, dim.height);
        Sun.draw(offScreen);
        g.drawImage(image,  0,  0,  this);
    }

    public void paint(Graphics g) {
    	update(g);
    }
}
