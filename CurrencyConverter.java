import java.util.Scanner;
public class CurrencyConverter{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Currency Converter!");
    System.out.println("What currency would you like to convert?");
    System.out.println("1. USD to Rupee");
    System.out.println("2. Rupee to USD");
    System.out.println("3. Euro to Rupee");
    System.out.println("4. Rupee to Euro");
    System.out.print("Enter your choice (1-4): ");

    int choice = scanner.nextInt();

    double amount, convertedAmount;

    switch (choice) {

      case 1 -> {
        System.out.print("Enter amount in USD: ");
        amount = scanner.nextDouble();
        convertedAmount = convertToRupee(amount);
        System.out.println("Converted amount in Rupee: " + convertedAmount);


      }
      case 2 -> {
        System.out.print("Enter amount in Rupee: ");
        amount = scanner.nextDouble();
        convertedAmount = convertToUSD(amount);
        System.out.println("Converted amount in USD: " + convertedAmount);


      }
      case 3 -> {
        System.out.print("Enter amount in Euro: ");
        amount = scanner.nextDouble();
        convertedAmount = convertToRupee(amount, "EUR");
        System.out.println("Converted amount in Rupee: " + convertedAmount);


      }
      case 4 -> {
        System.out.print("Enter amount in Rupee: ");
        amount = scanner.nextDouble();
        convertedAmount = convertToEuro(amount);
        System.out.println("Converted amount in Euro: " + convertedAmount);



      }
      default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
    }

    scanner.close();
  }

  // Simplified conversion methods (assuming exchange rates are up-to-date)
  public static double convertToRupee(double amount) {
    return amount * 83.47;
  }

  public static double convertToUSD(double amount) {
    return amount * 0.01198;
  }

  // Method to handle Euro conversion with a currency code indicator
  public static double convertToRupee(double amount, String currencyCode) {
    if (currencyCode.equals("EUR")) {
      return amount * 89.10;
    } else {
      // Handle other currencies if needed in the future
      return 0.0;
    }
  }

  public static double convertToEuro(double amount) {
    return amount * 0.0113;
  }
}