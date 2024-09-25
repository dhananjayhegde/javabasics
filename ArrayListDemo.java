import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<String> myCars = new ArrayList<String>();
        for (String arg : args) {
            cars.add(arg);
        }

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.forEach((car) -> {
            printElement(car);
        });
    }

    private static void printElement(String car) {
        System.out.println(car);
    }
}