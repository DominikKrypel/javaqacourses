
public class MyFirstProgram {


    public static void main(String[] args) { //Nazwy klas zaczynamy zawsze wielką literą, a wszystko pozostałe, np. pakiety, funckje z małej
        hello("world");// Najpierw uruchomiła się funkcja main, która zwróciła się du funkcji hello i przekazała łańcuch world
        hello("user");
        hello("Dominik");

        double len = 5;
        System.out.println("Powierzchnia kwadratu o boku " + len + "=" + area(len));

        double a = 5;
        double b = 6;
        System.out.println("Powierzchnia prostąkąta o bokach  " + a + " i " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {// To jest funkcja.
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double l) {
        return  l * l;
    }

    public static double area (double c, double d) {
        return c * d;
    }
}