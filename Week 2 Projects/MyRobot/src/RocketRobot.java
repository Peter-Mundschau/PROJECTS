
public class RocketRobot  {
	int rocketPower;
	int rocketStrength;
	
	public RocketRobot (int rocketPower, int rocketRange){
		
		rocketPower = rocketPower;
		rocketRange = rocketRange;
		
	public void shootRocket(){
		System.out.println("Here comes the BOOM!!");
		powerLevel -= 30;
		rocketRange = 50;
	}
		
	}
	
	
}
