public class Anagram {
    public static void main(String[] args) {
        /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
     */

        isAnagram("azaxram", "zaxaram");

    }

    private static boolean isAnagram(String s, String t) {
        /*char[] charS = s.toLowerCase().toCharArray();
        char[] charT = t.toLowerCase().toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        if (Arrays.equals(charS, charT)) return true;
        else return false;*/

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length()-1; i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length()-1; i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
        }


}
