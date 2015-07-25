public class FizzBuzzParser {
    public String parse(int number) {
        String parsedSecuence = "";
        for (int i = 1; i <= number; i++) {
            parsedSecuence += parseNumber(i);
        }
        return parsedSecuence;
    }

    private String parseNumber(int number) {
        if (number == 2) return "Fizz\n";
        if (number == 3) return "Buzz\n";
        return number + "\n";
    }
}
