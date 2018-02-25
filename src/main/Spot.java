package main;

import java.util.ArrayList;

public class Spot {

	char name;
	ArrayList<Spot> next;
	
	/**
	 * Create a new spot 
	 * @param name of the spot
	 */
	Spot(char name){
		this.name = name;
		next = new ArrayList<Spot>();
	}
	
	/**
	 * Set the next spot of this spot
	 * @param spot
	 */
	public void setNext(Spot spot) {
		next.add(spot);
	}
	
	/**
	 * get the next spot 
	 * @return
	 */
	public ArrayList<Spot> getNext() {
		
		return next;
	}
	
	/**
	 * get the name of this spot
	 * @return
	 */
	public char getName() {
		return name;
	}
}
