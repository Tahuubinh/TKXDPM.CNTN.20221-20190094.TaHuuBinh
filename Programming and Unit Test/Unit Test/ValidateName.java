import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class ValidateName {
    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Ta Huu Binh,true",
            "em123,false",
            "meo@gmail.com,false",
            ",false",
    })
    public void test(String name, boolean trueVal) {
        boolean boolVal = placeOrderController.validateName(name);
        assertEquals(trueVal, boolVal);
    }
}

