public class BalancePharenteses {
    /*Given a string s containing just the characters '(' and ')' determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */

    public static void main(String[] args) {
        System.out.println("The min parenthesis are ");
        String p = "))((";
        System.out.println(minParentheses(p));

    }

    private static int minParentheses(String p) {
        int balance = 0;
        int min = 0;

        for (int i = 0; i < p.length(); ++i) {
            //bal += p.charAt(i) == '(' ? 1 : -1;
            if (p.charAt(i) == '(') balance ++;
            else balance --;
            if (balance == -1) {
                min ++;
                balance ++;
            }
        }
        return balance + min;
    }
}
