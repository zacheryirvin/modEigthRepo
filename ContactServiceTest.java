/**
 * File: ContactServiceTest.java
 * Description: This file is part of the project one code base. It defines the ContactServiceTest class
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class: ContactServiceTest
 * Description: Implements the ContactServiceTest functionality.
 */
public class ContactServiceTest {
	@Test
	public void testAddAndGetContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("1234567890", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		service.addContact(contact);
		assertEquals(contact, service.getContact("1234567890"));
	}

	@Test
	public void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("1234567891", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		service.addContact(contact);
		service.deleteContact("1234567891");
		assertNull(service.getContact("1234567891"));
	}

	@Test
	public void testUpdateContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("1234567892", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		service.addContact(contact);
		service.updateFirstName("1234567892", "John");
		service.updateLastName("1234567892", "Doe");
		service.updatePhone("1234567892", "2222222222");
		service.updateAddress("1234567892", "123 Test Ave");

		Contact updated = service.getContact("1234567892");
		assertEquals("John", updated.getFirstName());
		assertEquals("Doe", updated.getLastName());
		assertEquals("2222222222", updated.getPhone());
		assertEquals("123 Test Ave", updated.getAddress());
	}

	@Test
	public void testDuplicateThrows() {
		ContactService service = new ContactService();
		Contact cOne = new Contact("1234567893", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		Contact cTwo = new Contact("1234567893", "Zach", "Irvin", "1234567890", "123 22nd Ave");
		service.addContact(cOne);
		assertThrows(IllegalArgumentException.class, () -> service.addContact(cTwo));
	}

}
