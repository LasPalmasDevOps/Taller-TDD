import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzParserShould {

    @Test
    public void not_parse_numbers_when_they_are_not_divisible_by_two_or_three() {
        assertThat(new FizzBuzzParser().parse(1), is("1\n"));
    }

    @Test
    public void parse_numbers_divisible_by_two_to_fizz() {
        assertThat(new FizzBuzzParser().parse(2), is("1\nFizz\n"));
    }

    @Test
    public void parse_numbers_divisible_by_three_to_buzz() {
        assertThat(new FizzBuzzParser().parse(3), is("1\nFizz\nBuzz\n"));
    }

    @Test
    public void parse_numbers_divisible_by_three_and_two_to_fizzbuzz() {
        assertThat(new FizzBuzzParser().parse(6),
                is("1\nFizz\nBuzz\nFizz\n5\nFizzBuzz\n"));
    }

}
