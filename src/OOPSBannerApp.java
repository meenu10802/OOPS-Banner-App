import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 *
 * A console-based Java application to demonstrate
 * Object-Oriented Programming concepts step by step.
 *
 * UC8: Use Map for Character Patterns and Render via Function

 */
public class OOPSBannerApp {

    /**
     * Inner static class to encapsulate a character
     * and its corresponding banner pattern.
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character pattern
         *
         * @param character banner character
         * @param pattern   7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the banner pattern
         *
         * @return String array representing character pattern
         */
        public String[] getPattern() {
            return pattern;
        }

        /**
         * Returns the character
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }
    }

    /**
     * Builds and returns a map of character patterns
     *
     * @return Map of character to CharacterPattern
     */
    private static Map<Character, CharacterPattern> buildCharacterPatternMap() {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "*********",
                "*        *",
                "*        *",
                "*********",
                "*       ",
                "*       ",
                "*       "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                "********",
                "*        ",
                "*        ",
                "********",
                "        *",
                "        *",
                "********"
        }));

        return patternMap;
    }

    /**
     * Renders the banner message using character patterns
     *
     * @param message    message to render (e.g., "OOPS")
     * @param patternMap map containing character patterns
     */
    private static void renderBanner(String message, Map<Character, CharacterPattern> patternMap) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Entry point of the application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = buildCharacterPatternMap();

        renderBanner("OOPS", patternMap);
    }
}