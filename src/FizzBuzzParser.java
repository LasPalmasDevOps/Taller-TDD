public class FizzBuzzParser {
    public String parse(int length) {
        String parsedSecuence = "";
        for (int i = 1; i <= length; i++) {
            parsedSecuence += parseNumber(i) + "\n";
        }
        return parsedSecuence;
    }

    private String parseNumber(int number) {
        String parsedNumber = parseIfDivisibleByTwo(number) + parseIfDivisibleByThree(number);
        return parsedNumber + defaultParseIfEmpty(parsedNumber, number);
    }

    private String defaultParseIfEmpty(String parsedNumber, int number){
        if (parsedNumber.equals("")) return String.valueOf(number);
        return "";
    }

    private String parseIfDivisibleByTwo(int number){
        if (number % 2 == 0) return "Fizz";
        return "";
    }

    private String parseIfDivisibleByThree(int number){
        if (number % 3 == 0) return "Buzz";
        return "";
    }
}
