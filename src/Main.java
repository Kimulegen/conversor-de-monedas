import model.Currency;
import service.ExchangeRateService;
import util.CurrencyConverter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final CurrencyConverter converter = new CurrencyConverter();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            System.out.print("Elija una opción válida: ");

            try {
                int opcion = scanner.nextInt();
                System.out.println();

                switch (opcion) {
                    case 1:
                        showConversion("Ingrese la cantidad de dólares: ", scanner, "USD", "ARS");
                        break;
                    case 2:
                        showConversion("Ingrese la cantidad de pesos argentinos: ", scanner, "ARS", "USD");
                        break;
                    case 3:
                        showConversion("Ingrese la cantidad de dólares: ", scanner, "USD", "BOB");
                        break;
                    case 4:
                        showConversion("Ingrese la cantidad de bolivianos: ", scanner, "BOB", "USD");
                        break;
                    case 5:
                        showConversion("Ingrese la cantidad de dólares: ", scanner, "USD", "BRL");
                        break;
                    case 6:
                        showConversion("Ingrese la cantidad de reales: ", scanner, "BRL", "USD");
                        break;
                    case 7:
                        showConversion("Ingrese la cantidad de dólares: ", scanner, "USD", "CLP");
                        break;
                    case 8:
                        showConversion("Ingrese la cantidad de pesos chilenos: ", scanner, "CLP", "USD");
                        break;
                    case 9:
                        showConversion("Ingrese la cantidad de dólares: ", scanner, "USD", "COP");
                        break;
                    case 10:
                        showConversion("Ingrese la cantidad de pesos colombianos: ", scanner, "COP", "USD");
                        break;
                    case 11:
                        handleCustomConversion(scanner);
                        break;
                    case 12:
                        System.out.println("¡Gracias por usar el conversor!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }

                if (opcion != 12) {
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine(); // Consumir el newline del número
                    scanner.nextLine(); // Esperar Enter
                }

            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println();
        System.out.println("1) Dólar >>> Peso argentino");
        System.out.println("2) Peso argentino >>> Dólar");
        System.out.println("3) Dólar >>> Boliviano boliviano");
        System.out.println("4) Boliviano boliviano >>> Dólar");
        System.out.println("5) Dólar >>> Real brasileño");
        System.out.println("6) Real brasileño >>> Dólar");
        System.out.println("7) Dólar >>> Peso chileno");
        System.out.println("8) Peso chileno >>> Dólar");
        System.out.println("9) Dólar >>> Peso colombiano");
        System.out.println("10) Peso colombiano >>> Dólar");
        System.out.println("11) Conversión custom");
        System.out.println("12) Salir");
        System.out.println();
        System.out.println("************************************************");
    }

    private static void showConversion(String message, Scanner scanner, String fromCurrency, String toCurrency) {
        System.out.print(message);
        double cantidadFrom = scanner.nextDouble();
        try {
            double resultado = converter.convert(cantidadFrom, fromCurrency, toCurrency);
            System.out.printf("%.2f USD = %.2f ARS%n", cantidadFrom, resultado);
        } catch (Exception e) {
            System.out.println("Error en la conversión: " + e.getMessage());
        }
    }

    private static void handleCustomConversion(Scanner scanner){
        scanner.nextLine();
        System.out.println("Elija una moneda a convertir");
        String fromCurrency = scanner.nextLine();
        System.out.println("Elija la moneda de destino");
        String toCurrency = scanner.nextLine();
        System.out.println("Ingrese la cantidad a convertir: ");
        Double cantidad = scanner.nextDouble();
        try {
            double resultado = converter.convert(cantidad, fromCurrency, toCurrency);
            System.out.printf("%.2f %s = %.2f %s%n", cantidad, fromCurrency, resultado, toCurrency);
        } catch (Exception e) {
            System.out.println("Error en la conversión: " + e.getMessage());
        }
    }

}