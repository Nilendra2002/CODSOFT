import java.util.Scanner;

public class CurrencyConverter {
    public static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        String apiEndpoint = "https://api.example.com/exchangerates";
        String apiKey = "YOUR_API_KEY";

        String url = String.format("%s?base=%s&symbols=%s&access_key=%s", apiEndpoint, baseCurrency, targetCurrency,
                apiKey);
        return 1.2;
    }

    public static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");

        System.out.print("Enter the base currency: ");
        String baseCurrency = sc.nextLine();

        System.out.print("Enter the target currency: ");
        String targetCurrency = sc.nextLine();

        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == 0.0) {
            System.out.println("Error fetching exchange rates");
            return;
        }

        System.out.print("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        double convertedAmount = convertCurrency(amount, exchangeRate);
        System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        return;
    }

}