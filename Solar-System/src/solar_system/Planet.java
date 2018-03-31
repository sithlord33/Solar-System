package solar_system;

import java.awt.*;

public class Planet extends OrbitingBall{
	protected Moon[] moons;
	
	Planet(Sun sun){
		setX(sun);
		setY(sun);
		setMoons();
	}
	
	protected Moon[] setMoons(){
		int n = 1 + (int)(Math.random() * 3);
		Moon[] m = new Moon[n];
		int rate = 20;
		for (int i = 0; i < n; i++){
			m[i] = new Moon(this);
			m[i].setRate(rate / (i + 1));
			m[i].setDistance((i + 3) * 10);
			m[i].setRadius(2);
			m[i].setColor(Color.GRAY);
		}
		return m;
	}
	
	/*protected void setX(Sun sun){
		this.cx = sun.x;
	}
	
	protected void setY(Sun sun){
		this.cy = sun.y;
	}
	
	protected void setColor(Color c){
		this.color = c;
	}*/
	
	/*public void draw(Graphics g){
		for (Moon m : moons){
			m.setX(this);
			m.setY(this);
			m.draw(g);
		}
	}*/
}
