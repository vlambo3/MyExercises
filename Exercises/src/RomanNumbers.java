import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static void main(String[] args) {
        Map<Character, Integer> integer_roman = new HashMap<>();
        integer_roman.put('I', 1);
        integer_roman.put('V', 5);
        integer_roman.put('X', 10);
        integer_roman.put('L', 50);
        integer_roman.put('C', 100);
        integer_roman.put('D', 500);
        integer_roman.put('M', 1000);

        String roman_number = "CXL";

        int total = integer_roman.get(roman_number.charAt(0));
        for (int i = 1; i < roman_number.length(); i++) {
            Integer current_number = integer_roman.get(roman_number.charAt(i));
            total+=current_number;

            //Chequeo si el actual numero ,es mas grande que el anterior ,significa que
            //el anterior no deberia haberlo sumado,deberia haberlo restado.
            Integer last_number = integer_roman.get(roman_number.charAt(i - 1));
            if (current_number> last_number){
                // Saco lo que agregue, y lo resto luego.
                total= total - (last_number * 2);
            }
        }
        System.out.println("The result is " + total);
    }
}