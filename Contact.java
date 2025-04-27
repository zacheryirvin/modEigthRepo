/**
 * File: Contact.java
 * Description: This file is part of the project one code base. It defines the Contact class.
 */

/**
 * Class: Contact
 * Description: Implements the Contact functionality.
 */
public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if(phone == null || phone.length() != 10 || !phone.matches("\\d{10}"))
			throw new IllegalArgumentException("Invalid phone number");
		if(address  == null || address.length() > 30)
			throw new IllegalArgumentException("Invalid address");

		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
		return this.firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
		return this.lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String setPhone(String phone) {
		if(phone == null || phone.length() != 10 || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone");
		}
	this.phone = phone;
	return this.phone;
	}

	public String getAddress() {
		return this.address;
	}

	public String setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
		return this.address;
	}
}
