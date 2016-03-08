
public class LaserRobot extends robot {

	int laserLevel;
	String laserColor;
		
			
	public LaserRobot (int laserLevel, String laserColor, String name, int powerLevel, int maxCapacity){
			this.laserLevel = laserLevel;
			this.laserColor = laserColor;
			this.name = name;
			this.powerLevel = powerLevel;
			this.maxCapacity= maxCapacity;
			
	}
	
	
	public void shootlaser(){
		System.out.println("Zzzaaaaapp...");
		System.out.println("You've been hit by a "+laserColor+" Laser!!!");
	}
	}
