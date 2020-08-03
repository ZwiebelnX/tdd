import java.util.ArrayList;
import java.util.List;

public class Mommifier {
    private static final List<Character> VOWELS = new ArrayList<>();
    private static final String MOMMY = "mommy";
    static {
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
    }

    /**
     * mommifier string.
     * @param originString the input string originString
     * @return the mommifier string
     */
    public String mommify(String originString) {
        StringBuilder result = new StringBuilder();
        int vowelsCount = 0;

        for (int i = 0; i < originString.length(); i++) {
            result.append(originString.charAt(i));
            if (VOWELS.contains(originString.charAt(i))) {
                vowelsCount++;
                if (i < originString.length() - 1 && VOWELS.contains(originString.charAt(i + 1))) {
                    result.append(MOMMY);
                }
            }
        }
        if (((double) vowelsCount / (double) originString.length()) >= 0.3) {
            return result.toString();
        } else {
            return originString;
        }
    }
}
