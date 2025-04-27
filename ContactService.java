/**
 * File: ContactService.java
 * Description: This file is part of the project one code base. It defines the ContactService class. 
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Class: ContactService
 * Description: Implements the ContactService functionality.
 */
public class ContactService {
	private final Map<String, Contact> contacts = new HashMap<>();

	public void addContact(Contact contact) {
		if(contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exists");
		}
		contacts.put(contact.getContactId(), contact);
	}

	public void deleteContact(String contactId) {
		if(!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not foundd");
		}
		contacts.remove(contactId);
	}

	public void updateFirstName(String contactId, String firstName) {
		contacts.get(contactId).setFirstName(firstName);
	}

	public void updateLastName(String contactId, String lastName) {
		contacts.get(contactId).setLastName(lastName);
	}

	public void updatePhone(String contactId, String phone) {
		contacts.get(contactId).setPhone(phone);
	}

	public void updateAddress(String contactId, String address) {
		contacts.get(contactId).setAddress(address);
	}

	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
}
