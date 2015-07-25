import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzParserShould {

    /**
     * TODO: para un número devuelve una secuencia desde el número 1 hasta el input
     * TODO: la secuencia debe estar parseada por las siguientes reglas
     *  cuando un número no es divisible por 2 ni 3 devolvemos el número
     *  cuando un número es divisible por 2 remplazamos por Fizz
     *  cuando un número es divisible por 3 remplazamos por Buzz
     *  cuando un número es divisible por 2 y 3 remplazamos por FizzBuzz
     *
     *  Examples:
     *   1 => 1 (porque no es divisible ni por 2 ni por 3)
     *   2 => 1\Fizz (porque 2 es divisible por 2)
     *   3 => 1\Fizz\Buzz (porque 2 es divisible por 2)
     *   6 => 1\Fizz\Buzz\Fizz\5\FizzBuzz
     */
    @Test
    public void not_parse_numbers_when_they_are_not_divisible_by_two_or_three() {
        assertThat(new FizzBuzzParser().parse(1), is("1\n"));
    }

}
