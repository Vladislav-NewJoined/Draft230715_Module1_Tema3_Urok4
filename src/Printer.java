public class Printer {
    public String maker;
    int price;

    void myMethod() {
        System.out.println("this is method");

    }

    void writePrinterInfo() {
        System.out.println("I am printer");
        System.out.println("My maker is " + this.maker);
        System.out.println("My price is " + this.price);
    }
}
