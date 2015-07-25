public class FizzBuzzParser {
    public String parse(int number) {
        String parsedSecuence = "";
        for (int i = 1; i <= number; i++) {
            if (i == 2) {
                parsedSecuence += "Fizz\n";
                continue;
            }
            if (i == 3) {
                parsedSecuence += "Buzz\n";
                continue;
            }
            parsedSecuence += i + "\n";
        }
        return parsedSecuence;
    }
}
