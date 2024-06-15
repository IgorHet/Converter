package app;

public class Main {
    private static final double CONV_FACTOR = 5.0 / 9.0;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        double fahrenheit = 100;
        double celsius = convFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
    }

    private static double convFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * CONV_FACTOR;
    }
}