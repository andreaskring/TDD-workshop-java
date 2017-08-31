package dk.magenta.tdd.workshop;

/**
 * Provide an AddressHandlerStrategy via the constructor 
 * when instantiating a class implementing this interface.
 */
public interface Person {

	/**
	 * Get the CPR number of the person.
	 * @return CPR number, e.g. 241217-1111.
	 */
	public String getCprNumber();
	
	/**
	 * Get the name of the person.
	 * @return Full name of the person.
	 */
	public String getName();
	
	/**
	 * Check if the CPR number is valid.
	 * @return true if the CPR number is valid and false otherwise.
	 */
	public boolean isCprNumberValid();

	/**
	 * Set the name of the person.
	 * @param name The full name of the person.
	 * @throws IllegalArgumentException if name is invalid (blank).
	 */
	public void setName(String name) throws IllegalArgumentException;
	
	/**
	 * Get the address of the person from the CPR number.
	 * @return The address of the person.
	 */
	public String getAddress();
		
}
