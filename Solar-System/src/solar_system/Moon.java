package solar_system;

import java.awt.*;

public class Moon extends OrbitingBall{
	Moon(Planet planet){
		setX(planet);
		setY(planet);
	}
	
	/*protected void setX(Planet planet){
		this.cx = planet.x;
	}
	
	protected void setY(Planet planet){
		this.cy = planet.y;
	}
	
	protected void setColor(){
		this.color = Color.GRAY;
	}*/
}
