package org.audition;


public class AuditionTest {

	public static void main(String[] args) {
	
		Performer pf = new Performer();
		Performer pf1 = new Performer();
		Performer pf2 = new Performer();
		Performer pf3 = new Performer();
		
		Dancer dn = new Dancer("folk");
		Dancer dn2 = new Dancer("western");
		
		Vocalists vc = new Vocalists("G",5);
		
		Performer audition[]={pf,pf1,pf2,pf3,dn,dn2,vc};
		for(Performer a:audition){
			System.out.println(a.toString());
		}
	}

}
