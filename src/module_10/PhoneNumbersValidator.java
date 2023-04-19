package module_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersValidator {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\48578\\IdeaProjects\\loga_module_10\\src\\files\\file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}");

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
