import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "ria1bEdUk6zyoenvzyoenvneoyzyoenvzyoenvneoyzyoenvzyoenvneoyzyoenv";

        String reversedString = new StringBuilder(s).reverse().toString();
        String removedCharsString = reversedString.replaceAll("[zyoenv]", "");
        String secondReversedString = new StringBuilder(removedCharsString).reverse().toString();

        StringBuilder oddIndexString = new StringBuilder();
        for (int i = 1; i < secondReversedString.length(); i += 2) {
            oddIndexString.append(secondReversedString.charAt(i));
        }

        String finalReversedString = new StringBuilder(oddIndexString.toString()).reverse().toString();
        String secondPart = new StringBuilder(finalReversedString).reverse().toString();

        System.out.println(secondPart);
    }
}
