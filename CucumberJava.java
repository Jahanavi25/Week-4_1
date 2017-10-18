package cucumberJava; 

import org.audition.*;
import org.calculator.*;
import static org.junit.Assert.*;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class CucumberJava { 
   
	Performer p=null;
	@Given("^Performer$")
	public void Performer() {
	    p = new Performer();
	}

	@When("^Asked to audition$")
	public void Asked_to_audition() {

	}

	@Then("^(\\d+)-performer$")
	public void _performer(int arg1) {
	    
	    assertTrue(p.toString().endsWith(" - performer"));
	}

	Dancer dancer =null;
	@Given("^Dancer$")
         public void Dancer() {
	   dancer = new Dancer("tap");
	}
	
	
	

	@Then("^tap-(\\d+)-dancer$")
	public void tap_dancer(int arg1) {
		System.out.println(dancer.toString());
		assertTrue(dancer.toString().startsWith("tap ")&& dancer.toString().endsWith("- dancer"));
	   }

	

    Vocalists v =null;

@Given("^Vocalist$")
public void Vocalist() {
    v = new Vocalists("G");
}

@Then("^I sing in the key of -G-(\\d+)$")
public void I_sing_in_the_key_of_G(int arg1) {
	System.out.println(v.toString());
	assertTrue(v.toString().startsWith("I sing in the key of – G -"));
	
}

@When("^Asked to audition at volume (\\d+)$")
public void Asked_to_audition_at_volume(int arg1) {
	v = new Vocalists("G",7);
}

@Then("^I sing in the key of -G-at the volume (\\d+)-(\\d+)$")
public void I_sing_in_the_key_of_G_at_the_volume_(int arg1, int arg2) {
	System.out.println(v.toString());
	assertTrue(v.toString().startsWith("I sing in the key of – G –  at the volume 7 - "));
    
}

    Performer per[]=null;
	@Given("^Audition$")
	public void Audition() {
		per=new Performer[4];
	}

	@When("^I request an audition with (\\d+) performers$")
	public void I_request_an_audition_with_performers(int arg1) {
	    per[0]=new Performer();
	    per[1]=new Dancer("folk");
	    per[2]=new Vocalists("C");
	    per[3]=new Vocalists("G",6);
	}

	@Then("^I expect to see (\\d+) performances$")
	public void I_expect_to_see_performances(int arg1) {
		assertTrue(per[0].toString().endsWith(" - performer"));
		assertTrue(per[1].toString().startsWith("folk ")&& per[1].toString().endsWith("- dancer"));
		assertTrue(per[2].toString().startsWith("I sing in the key of – C -"));
		assertTrue(per[3].toString().startsWith("I sing in the key of – G –  at the volume 6 - "));
	}

}