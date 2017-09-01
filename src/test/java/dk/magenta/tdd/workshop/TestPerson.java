package dk.magenta.tdd.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPerson {

	private Person person;
	
	@Before
	public void setUp() {
		person = new PersonImpl("Clint");
	}
	
	// Testing getName
	
	@Test
	public void shouldReturnClintWhenNameIsClint() {
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
	
	// Testing setName
	
	@Test
	public void shouldReturnChuckWhenNameIsSetToChuck() {
		person.setName("Chuck");
		assertEquals("Chuck", person.getName());
	}

	@Test
	public void shouldReturnHarryWhenNameIsSetToHarry() {
		person.setName("Harry");
		assertEquals("Harry", person.getName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfNameIsSetToBlank() {
		person.setName("");
	}
}
