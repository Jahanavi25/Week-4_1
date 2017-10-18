package org.audition;

/*
 * Dancer Class to store dancers details
 */
public class Dancer extends Performer {

	//private variables to store styleName
	private String styleName;
	
	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Dancer( String styleName) {
		super();
		this.styleName = styleName;
	}
	
	public String toString(){
		return styleName+" - "+getPerformerId()+" - dancer";	
	}
	

}
