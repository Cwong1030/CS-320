
public class Contact {
	// Establishing private string variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// establishing Contact object
	public Contact(String id, String fName, String lName, String pNumb, String addr) {
		// Checking if contact ID isn't greater than 10 or null
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// Checking if first name isn't greater than 10 or null
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// Checking if last name isn't greater than 10 or null
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// Checking if phone number isn't greater than 10 or null
		if (pNumb == null || pNumb.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		// Checking if address isn't greater than 30 or null
		if (addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}

		this.contactID = id;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = pNumb;
		this.address = addr;
	}
	
	// Getters
	public String getContactID() {
		return this.contactID;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setContactID(String id) {
		this.contactID = id;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	public void setPhoneNumber(String pNumb) {
		this.phoneNumber = pNumb;
	}
	public void setAddress(String addr) {
		this.address = addr;
	}
	
}
