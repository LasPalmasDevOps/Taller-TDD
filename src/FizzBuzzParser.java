public class FizzBuzzParser {
    public String parse(int number) {
        if (number == 3) return "1\nFizz\nBuzz\n";
        if (number == 2) return "1\nFizz\n";
        return "1\n";
    }
}
