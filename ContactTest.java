/**
 * File: ContactTest.java
 * Description: This file is part of the project one code base. It defines the ContactTest class. 
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class: ContactTest
 * Description: Implements the ContactTest functionality.
 */
public class ContactTest {
	@Test
	public void testValidContactCreation() {
		Contact contact = new Contact("1234567890", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		assertEquals("1234567890", contact.getContactId());
		assertEquals("Zach", contact.getFirstName());
		assertEquals("Irvin", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 22nd Ave", contact.getAddress());
	}

	@Test
	public void testInvalidContactId() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Zach", "Irvin", "1234567890", "123 22nd Ave"));
		assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Zach", "Irvin", "1234567890", "123 22nd Ave"));
	}

	@Test
	public void testInvalidPhone() {
	        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "Zach", "Irvin", "1234", "123 22nd Ave"));	
	}

	@Test
	public void testSetters() {
		Contact contact = new Contact("1234567890", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		contact.setFirstName("John");
		contact.setLastName("Doe");
		contact.setPhone("1111111111");
		contact.setAddress("123 Test Ave");
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1111111111", contact.getPhone());
		assertEquals("123 Test Ave", contact.getAddress());
	}
}
