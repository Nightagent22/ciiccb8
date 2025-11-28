import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");

        String inputString = scanner.nextLine();

        scanner.close();

        String normalizedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(normalizedString);

        String reversedString = stringBuilder.reverse().toString();

        if (normalizedString.equals(reversedString)) {

            System.out.println("The input string is a palindrome.");

        } else {

            System.out.println("The input string is not a palindrome.");

        }

    }


}
