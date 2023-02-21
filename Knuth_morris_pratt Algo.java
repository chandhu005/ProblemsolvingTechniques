import java.util.*;

class Program {
  public static boolean knuthMorrisPrattAlgorithm(String string, String substring) {
    int[] substringMatchesIndex = new int[substring.length()];

        Arrays.fill(substringMatchesIndex, -1);

        int j = 0, i = 1;

        while (i < substring.length()) {
            if (substring.charAt(i) == substring.charAt(j)) {
                substringMatchesIndex[i] = j;
                i++;
                j++;
            } else if (j > 0) {
                j = substringMatchesIndex[j - 1] + 1;
            } else {
                i++;
            }
        }

        j = 0;
        i = 0;

        while (i + substring.length() - j <= string.length()) {
            if (string.charAt(i) == substring.charAt(j)) {
                if (j == substring.length() -1) return true;
                i++;
                j++;
            } else if (j > 0) {
                j = substringMatchesIndex[j - 1] + 1;
            } else {
                i++;
            }
        }
        return false;
  }
}
