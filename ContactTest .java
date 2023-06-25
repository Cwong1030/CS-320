
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContactTest {
	
	// Contact ID test
	@Test
	void testIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("77172199600", "Chris", "Wong",
					"5105369487", "1234 Elm Street");
			});
	}
	
	// Contact ID null test
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null, "Chris", "Wong", 
					"5105369487", "1234 Elm Street");
			});
	}
	
	// First name test
	@Test
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960", "Christopher", "Wong", 
					"5105369487", "1234 Elm Street");
			});
		}

	// First name null test
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960", null, "Wong", 
					"5105369487", "1234 Elm Street");
			});
		}
	
	// Last name length test
	@Test
	void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960", "Chris", "Hendrickson", 
					"5105369487", "1234 Elm Street");
			});
		}

	// Last name null test
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960" ,"Chris", null, 
					"5105369487", "1234 Elm Street");
			});
		}
	
	// Phone number length test
	@Test
	void testPhoneNumberLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960", "Chris", "Hendrickson", 
					"51053694873", "1234 Elm Street");
			});
		}

	// Phone number null test
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960" ,"Chris", "Wong", 
					null, "1234 Elm Street");
			});
		}
	
	// Address length test
	@Test
	void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960", "Chris", "Hendrickson", 
					"51053694873", "1234567891011121314151617181920 Elm Street");
			});
		}

	// Address null test
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("7717219960" ,"Chris", "Wong", 
					"51053694873", null);
			});
		}
}
