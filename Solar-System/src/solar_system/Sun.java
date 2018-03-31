package solar_system;

import java.awt.*;
import java.util.*;

public class Sun extends OrbitingBall{
	private Planet[] planets;
	private Moon[] moons;
	
	Sun(Dimension dim){
		this.dim = dim;
		x = dim.width / 2;
		y = dim.height / 2;
		planets = setPlanets();
	}
	
	private Planet[] setPlanets(){
		Planet[] P = new Planet[8];
		int rate = 15;
		for (int i = 0; i < 8; i++){
			P[i] = new Planet(this);
			P[i].setRate(rate / (i + 1));
			P[i].setDistance((i + 1) * 90);
		}
		P[0].setColor(Color.ORANGE);
		P[1].setColor(Color.GREEN);
		P[2].setColor(Color.BLUE);
		P[3].setColor(Color.RED);
		P[4].setColor(Color.ORANGE);
		P[5].setColor(Color.DARK_GRAY);
		P[6].setColor(Color.MAGENTA);
		P[7].setColor(Color.BLUE);
		
		P[0].setRadius(5);
		P[1].setRadius(9);
		P[2].setRadius(10);
		P[3].setRadius(7);
		P[4].setRadius(20);
		P[5].setRadius(15);
		P[6].setRadius(14);
		P[7].setRadius(13);
		
		for (Planet p : P)
			p.moons = p.setMoons();
		
		return P;
	}
	
	public void draw(Graphics g){
		radius = 50;
		g.setColor(Color.YELLOW);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
		for (Planet p : planets){
			p.setX(this);
			p.setY(this);
			p.draw(g);
			/*for (int i = 0; i < p.moons.length; i++){
				p.moons[i].setX(p);
				p.moons[i].setY(p);
				p.moons[i].draw(g);
			}*/
			for(Moon m : p.moons){
					m.setX(p);
					m.setY(p);
					m.draw(g);
			}
		}
	}
}
