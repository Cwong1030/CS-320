
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	// Contact Add test
	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("219197006", "Dr", "Fate", "8746756719", "423 E 27th Street");
		Contact test2 = new Contact("474899011", "Dr", "Doom", "1814209267", "243 E 22nd Street");
		Contact test3 = new Contact("897049268", "Dr", "Strange", "4077358109", "334 E 21st Street");
		
		assertEquals(true, cs.addContact(test1));
		assertEquals(true, cs.addContact(test2));
		assertEquals(false, cs.addContact(test2));
		assertEquals(true, cs.addContact(test3));
		assertEquals(false, cs.addContact(test3));
	}
	
	// Contact Delete test
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("219197006", "Dr", "Fate", "8746756719", "423 E 27th Street");
		Contact test2 = new Contact("474899011", "Dr", "Doom", "1814209267", "243 E 22nd Street");
		Contact test3 = new Contact("897049268", "Dr", "Strange", "4077358109", "334 E 21st Street");
		
		assertEquals(true, cs.addContact(test1));
		assertEquals(true, cs.addContact(test2));
		assertEquals(true, cs.addContact(test3));
		assertEquals(true, cs.deleteContact("219197006"));
		assertEquals(true, cs.deleteContact("474899011"));
		assertEquals(true, cs.deleteContact("897049268"));
	}
	
	// Contact Update test
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("219197006","Dr", "Fate", "8746756719", "423 E 27th Street");
		Contact test2 = new Contact("474899011","Dr", "Doom", "1814209267", "243 E 22nd Street");
		Contact test3 = new Contact("897049268","Dr", "Strange", "4077358109", "334 E 21st Street");
		
		assertEquals(true, cs.addContact(test1));
		assertEquals(true, cs.addContact(test2));
		assertEquals(true, cs.addContact(test3));		
	}
}

