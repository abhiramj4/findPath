package main;

public class Main {

	/**
	 * Given a starting position and a final position, determine a 
	 * route to the target position, using backtracking
	 * @param position to start in
	 * @param target to find
	 * @return true if the path is found successfully
	 */
	public static boolean findPath(Spot position, Spot target) {
		
		if(position == target) {
			//we're at the position, return true
			
			return true;
			
		} else {
			//pick any position to go to, out of available positions
			//while the available positions aren't empty
			while(!position.getNext().isEmpty()) {
				
				//get the next spot
				Spot nextSpot = position.getNext().get(0);
				//print a simple message, where we are going
				System.out.println(position.getName() + " to " + nextSpot.getName());
				//Keep going, trying to find the base case
				//if eventually the base case can't be satisfied, remove an option from the initial starting point
				//this means that next spot does NOT lead to the target
				if(!findPath(nextSpot,target)) {
				
					position.getNext().remove(0);
					
				} else {
					//otherwise return true
					return true;
				}
				

			}
			//no way was found, return false
			return false;
		}
		
	}
	
	
	public static void main(String [] args) {
		
		Spot a = new Spot('A');
		Spot b = new Spot('B');
		Spot c = new Spot('C');
		Spot d = new Spot('D');
		Spot e = new Spot('E');
		
		a.setNext(b);
		b.setNext(c);
		b.setNext(d);
		c.setNext(e);
		
		System.out.println(findPath(a,e));
	}
}
