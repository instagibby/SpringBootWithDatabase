package home.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	private String ownerFirstName;
	private String ownerLastName;
	
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Owner(String firstName, String lastName) {
		super();
		this.ownerFirstName = firstName;
		this.ownerLastName = lastName;
	}


	public String getFirstName() {
		return ownerFirstName;
	}

	public void setFirstName(String firstName) {
		this.ownerFirstName = firstName;
	}

	public String getLastName() {
		return ownerLastName;
	}

	public void setLastName(String lastName) {
		this.ownerLastName = lastName;
	}

	@Override
	public String toString() {
		return "Owner [firstName=" + ownerFirstName + ", lastName=" + ownerLastName + "]";
	}
	
	
}
