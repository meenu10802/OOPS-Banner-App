/**
 * OOPS Banner App
 *
 * A console-based Java application to demonstrate
 * Object-Oriented Programming concepts step by step.
 *
 * UC7: Store Character Pattern in an Inner Static Class
 *
 * @author YourName
 * @version 1.0
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
     * Entry point of the application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "*********",
                "*        *",
                "*        *",
                "*********",
                "*        ",
                "*        ",
                "*         "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                "********",
                "*        ",
                "*        ",
                "********",
                "        *",
                "        *",
                "********"
        });

        // Print OOPS banner using encapsulated patterns
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    oPattern.getPattern()[i] + " " +
                            oPattern.getPattern()[i] + " " +
                            pPattern.getPattern()[i] + " " +
                            sPattern.getPattern()[i]
            );
        }
    }
}