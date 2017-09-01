package dk.magenta.tdd.workshop;

public class PersonImpl implements Person {

	private String cpr;
	private String name;
	
	public PersonImpl(String name, String cpr) throws IllegalArgumentException {
		setName(name);
		this.cpr = cpr;
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
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return null;
	}

}
