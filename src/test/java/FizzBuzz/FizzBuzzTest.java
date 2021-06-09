package FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author engincanvaran
 * @project Unit Testing
 * @date 9.06.2021 18:13
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenTheNumberIsDividedByThree() {
        assertEquals("Fizz", fizzBuzz.stringFor(3));
    }

    @Test
    void returnFizzWhenTheNumberIsDividedByFive() {
        assertEquals("Buzz", fizzBuzz.stringFor(5));
    }

    @Test
    void returnFizBuzzWhenTheNumberIsDividedByFiveAndThree() {
        assertEquals("FizzBuzz", fizzBuzz.stringFor(15));
    }

    @Test
    void returnTheNumberItselfWhenTheNumberIsNotDividedByFiveAndThree() {
        assertEquals("7", fizzBuzz.stringFor(7));
    }

    @Test
    void throwsIllegalArgumentExceptionWhenTheNumberIsLessThan1OrMoreThan100() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.stringFor(-1));
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.stringFor(102));
    }

}
