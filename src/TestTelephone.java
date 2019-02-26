import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestTelephone {

	private String strPhoneNumberFormatted = "(484)345-9190";
	private String strPhoneNumberUnformatted = "4843459190";
	
	@Test
	void testIsFormatted() {
		assertTrue(Telephone.isFormatted(strPhoneNumberFormatted));
		assertFalse(Telephone.isFormatted(strPhoneNumberUnformatted));
	}
	
	@Test
	void testFormat() {
		assertEquals(strPhoneNumberFormatted, Telephone.format(strPhoneNumberUnformatted));
	}
	
	@Test
	void testUnformat() {
		assertEquals(strPhoneNumberUnformatted, Telephone.unformat(strPhoneNumberFormatted));
	}

}
