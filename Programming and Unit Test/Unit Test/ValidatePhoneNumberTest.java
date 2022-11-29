import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatePhoneNumberTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "0102034342,true",
            "23434,false",
            "em123,false",
            "meo@gmail.com,false",
            ",false",
    })
    public void test(String name, boolean trueVal) {
        boolean boolVal = placeOrderController.validatePhoneNumber(name);
        assertEquals(trueVal, boolVal);
    }

}

//@BeforeEach
//void setUp() throws Exception {
//}
//
//@Test
//public void test() {
//	fail("Not yet implemented");
//}

