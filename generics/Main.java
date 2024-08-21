@VeryImportant
public class Main {

    public static void main(String[] args) {
        // integer
        Printer<Integer> printer = new Printer<Integer>(11);
        printer.print();

        // double
        Printer<Double> printerDouble = new Printer<Double>(34.5);
        printerDouble.print();
    }
}
