package org.audition;
/**
 * 
 * @author Jahnavi
 * Class for storing Vocalists this extends the performer class to get the uniqueId and performer
 *
 */
public class Vocalists extends Performer {
	
	//Private Variables to store key and volume of the Vocalist
	private String key;
	private int volume;
	
	public Vocalists(String key) {
		super();
		this.key = key;
		this.volume=0;
	}
      
	public Vocalists( String key, int volume) {
		super();
		this.key = key;
		this.volume = volume;
	}

	//Getters and Setters for the variables
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String toString(){
		if(volume==0)
		return "I sing in the key of – "+key+" - "+getPerformerId();
		
		else
			return "I sing in the key of – "+key+" –  at the volume "+volume+" - "+getPerformerId();
	}

	
}
