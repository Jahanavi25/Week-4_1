package org.audition;
import java.util.Random;


public class IdGenImpl implements IdGen {

	@Override
	public long generateId() {
		Random r=new Random();
		long id=r.nextLong();
		id=id%1000;
		if(id<0)
			id=-id;
		return id;
	}
	
	

}
