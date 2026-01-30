/**
 * OOPS Banner App
 *
 * A console-based Java application to demonstrate
 * Object-Oriented Programming concepts step by step.
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
        // UC implementations will be added step by step


        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ",
                "********", " ", "********", " ", "*********", " ", "********");

        bannerLines[1] = String.join(" ",
                "*      *", " ", "*      *", " ", "*        *", " ", "*        ");

        bannerLines[2] = String.join(" ",
                "*      *", " ", "*      *", " ", "*        *", " ", "*        ");

        bannerLines[3] = String.join(" ",
                "*      *", " ", "*      *", " ", "*********", " ", "********");

        bannerLines[4] = String.join(" ",
                "*      *", " ", "*      *", " ", "*", "                ", "*");

        bannerLines[5] = String.join(" ",
                "*      *", " ", "*      *", " ", "*", "                ", "*");

        bannerLines[6] = String.join(" ",
                "********", " ", "********", " ", "*", "         ", "********");

        for (String line : bannerLines) {
            System.out.println(line);
        }

    }
}