package dk.magenta.tdd.workshop;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	// Testing getName
	
	@Test
	public void shouldReturnClintWhenNameIsClint() {
		Person person = new PersonImpl("Clint");
		assertEquals("Clint", person.getName());
	}
	
	@Test
	public void shouldReturnBruceWhenNameIsBruce() {
		Person person = new PersonImpl("Bruce");
		assertEquals("Bruce", person.getName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfNameIsBlank() {
		new PersonImpl("");
	}

}
