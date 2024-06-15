package app;

public class Main {
    private static final double CONV_FACTOR = 5.0 / 9.0;
    private static final double OFFSET = 32;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        double fahrenheit = 100;
        double celsius = convFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");

        celsius = 37;
        fahrenheit = convCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - OFFSET) * CONV_FACTOR;
    }

    private static double convCelsiusToFahrenheit(double celsius) {
        return celsius / CONV_FACTOR + OFFSET;
    }
}