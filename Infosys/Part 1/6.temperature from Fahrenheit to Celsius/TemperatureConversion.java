public class TemperatureConversion {
    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.3f%n", celsius);
    }

    public static void main(String[] args) {
        double fahrenheit = 40;
        fahrenheitToCelsius(fahrenheit);
    }
}
