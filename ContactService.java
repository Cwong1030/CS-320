
import java.util.*;

public class ContactService {
	ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// Adding Contact with unique ID
	public boolean addContact(Contact newContact) {
		boolean contains = false;
		for (Contact con : contacts) {
			if (con.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				contains = true;
				break; // Breaks if contact is already in list
			}
		}
		// Adds contact to list if not contained in list
		if (!contains) {
			contacts.add(newContact);
			return true;
		}
		else {
			return false;
		}
	}
	
	// Deleting Contact per contact ID
	public boolean deleteContact(String contactID) {
		boolean deleted = false;
		for (Contact con : contacts) {
			if (con.getContactID().equalsIgnoreCase(contactID)) {
				contacts.remove(con);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	// Update contact information
	public boolean updateContact(String id, String fName, String lName, String pNumb, String addr) {
		for (Contact contactList: contacts) {
			if (contactList.getContactID().equals(id)) {
				if (!fName.equals("") && !(fName.length()>10)) {
					contactList.setFirstName(fName);
				}
				if (!lName.equals("") && !(lName.length()>10)) {
					contactList.setLastName(lName);
				}
				if (!pNumb.equals("") && !(pNumb.length()>10)) {
					contactList.setPhoneNumber(pNumb);
				}
				if (!addr.equals("") && !(addr.length()>10)) {
					contactList.setAddress(addr);
				}
				return true;
			}
		}
		return false;
	}
}	
	