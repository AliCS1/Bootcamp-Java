/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pricedisplay;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public String GetPriceLabel(String item, Double price) {
        return String.format("The price for item: %s is %f",item,price);

    }
}
