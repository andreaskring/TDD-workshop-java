package dk.magenta.tdd.workshop;

public interface AddressHandlerStrategy {

	/**
	 * Obtain the address of a person from the remote server.
	 * @param cprNumber The CPR number of the person
	 * @return The unique address of the person 
	 */
	public String fetchAddressFromServer(String cprNumber);
}
