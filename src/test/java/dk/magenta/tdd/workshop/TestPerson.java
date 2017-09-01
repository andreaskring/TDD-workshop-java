package dk.magenta.tdd.workshop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPerson {

	private Person person1;
	private Person person2;
	
	@Before
	public void setUp() {
		person1 = new PersonImpl("Clint", "010117-1111");
		person2 = new PersonImpl("Bruce", "010117-1112");		
	}
	
	// Testing getName
	
	@Test
	public void shouldReturnClintWhenNameIsClint() {
		assertEquals("Clint", person1.getName());
	}
	
	@Test
	public void shouldReturnBruceWhenNameIsBruce() {
		assertEquals("Bruce", person2.getName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfNameIsBlank() {
		new PersonImpl("", "010117-1111");
	}
	
	// Testing setName
	
	@Test
	public void shouldReturnChuckWhenNameIsSetToChuck() {
		person1.setName("Chuck");
		assertEquals("Chuck", person1.getName());
	}

	@Test
	public void shouldReturnHarryWhenNameIsSetToHarry() {
		person1.setName("Harry");
		assertEquals("Harry", person1.getName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionIfNameIsSetToBlank() {
		person1.setName("");
	}
	
	// Testing getCprNumber
	
	@Test
	public void shouldReturn010117_1111WhenCprIs010117_1111() {
		assertEquals("010117-1111", person1.getCprNumber());
	}
	
	@Test
	public void shouldReturn010117_1112WhenCprIs010117_1112() {
		assertEquals("010117-1112", person2.getCprNumber());
	}

}
