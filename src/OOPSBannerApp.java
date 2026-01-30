/**
 * OOPS Banner App
 *
 * A console-based Java application to demonstrate
 * Object-Oriented Programming concepts step by step.
 *
 * UC6: Refactor banner logic into static helper methods
 *
 * @author YourName
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Entry point of the application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    oPattern[i] + " " +
                            oPattern[i] + " " +
                            pPattern[i] + " " +
                            sPattern[i]
            );
        }
    }

    /**
     * Builds banner pattern for character 'O'
     *
     * @return String array representing the pattern of O
     */
    private static String[] getOPattern() {
        return new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        };
    }

    /**
     * Builds banner pattern for character 'P'
     *
     * @return String array representing the pattern of P
     */
    private static String[] getPPattern() {
        return new String[]{
                "*********",
                "*        *",
                "*        *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        };
    }

    /**
     * Builds banner pattern for character 'S'
     *
     * @return String array representing the pattern of S
     */
    private static String[] getSPattern() {
        return new String[]{
                "********",
                "*        ",
                "*        ",
                "********",
                "        *",
                "        *",
                "********"
        };
    }
}