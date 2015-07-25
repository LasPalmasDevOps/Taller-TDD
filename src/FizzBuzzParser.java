public class FizzBuzzParser {
    public String parse(int length) {
        String parsedSecuence = "";
        for (int i = 1; i <= length; i++) {
            parsedSecuence += parseNumber(i);
        }
        return parsedSecuence;
    }

    private String parseNumber(int number) {
        if (number % 2 == 0 && number % 3 == 0) return "FizzBuzz\n";
        if (number % 2 == 0) return "Fizz\n";
        if (number % 3 == 0) return "Buzz\n";
        return number + "\n";
    }
}
