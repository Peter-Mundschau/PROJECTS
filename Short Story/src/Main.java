import java.util.*;
import java.text.*;
public class Main {
// Every time I put in else if it errors
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int x = 0;
	int y = 0;
	
	
	System.out.println("Use w,s,a,d to move");
		String input = Input.getInput();	
		
	if (input.equals("w")) {
		if (y >= 0) {
				y++;
			}
			System.out.println("There is a door");
			
		} else {
			System.out.println("There is something in the way");			
		}
		if (input.equals("s")) {
			if (y <= 0) {
				y--;
		}	
			System.out.println("There is a Hallway");
		} else {
			
			System.out.println("There is a Lake");
		}
			
	  if (input.equals("a")) {
			if (x >= 0) {
					x++;
				}
				System.out.println("You are on a dirt road");
				
			} else {
				System.out.println("There is something in the way");			
			}
		
		
	  if (input.equals("d")) {
			if (x <= 0) {
					x--;
				}
				System.out.println("You are on a brick path");
				
			} else {
				System.out.println("You went the wrong way ");			
			}
		
		
		
		
		
		

	}

}
