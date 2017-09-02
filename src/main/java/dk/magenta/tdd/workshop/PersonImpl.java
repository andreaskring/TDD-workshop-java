package dk.magenta.tdd.workshop;

import java.util.regex.Pattern;

public class PersonImpl implements Person {

	private String cpr;
	private String name;
	private AddressHandlerStrategy addressHandlerStrategy;
	
	public PersonImpl(String name, String cpr) throws IllegalArgumentException {
		setName(name);
		this.cpr = cpr;
		addressHandlerStrategy = null;
	}
	
	@Override
	public String getCprNumber() {
		return cpr;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isCprNumberValid() {
		return Pattern.matches("[0-3][0-9][0-1][0-9]{3}?-[0-9]{4}?", cpr);
	}

	@Override
	public void setName(String name) throws IllegalArgumentException {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty!");
		}
		this.name = name;
	}

	@Override
	public String getAddress() {
		return addressHandlerStrategy.fetchAddressFromServer(cpr);
	}

}
