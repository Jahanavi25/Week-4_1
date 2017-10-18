package org.audition;

/*
 * Performer Class to store details of performers
 */
public class Performer {

	//Private variables of performers
	private long performerId;
	
	

	public Performer() {
		
		IdGen ig = new IdGenImpl();
		this.performerId = ig.generateId();
	}

	public long getPerformerId() {
		return performerId;
	}



public String toString(){
	return performerId+" - performer";
}
}
