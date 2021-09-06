import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "5,Buzz",
            "6,Fizz",
            "10,Buzz",
            "15,FizzBuzz",
            "30,FizzBuzz"
    })
    @DisplayName("Simple multiplication should work")
    void testFizzBuzz(int input, String output) {
        assertEquals(output, FizzBuzz.convert(input),
                "Regular multiplication should work");
    }

}
