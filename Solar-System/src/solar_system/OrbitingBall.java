package solar_system;

import java.awt.*;

public abstract class OrbitingBall implements Ball {
	protected int distance; 
    protected int angle;
    protected int radius;
    protected int rate;
    protected int x, y;
    protected int cx, cy;
    protected Color color;
    protected Dimension dim;

    protected void setRadius(int radius){
    	this.radius = radius;
    }
    
    protected void setDistance(int distance){
    	this.distance = distance;
    }

	protected void setRate(int rate){
		this.rate = rate;
	}
	
	protected void setX(OrbitingBall b){
		this.cx = b.x;
	}
	
	protected void setY(OrbitingBall b){
		this.cy = b.y;
	}
	
	protected void setColor(Color c){
		this.color = c;
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		x = (int) (cx + distance * Math.cos(Math.toRadians(angle)));
		y = (int) (cy + distance * Math.sin(Math.toRadians(angle)));
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
		angle += rate;
	}
}
