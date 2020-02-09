
public class MyFirstProgram {


    public static void main(String[] args) { //Nazwy klas zaczynamy zawsze wielką literą, a wszystko pozostałe, np. pakiety, funckje z małej
        hello("world");// Najpierw uruchomiła się funkcja main, która zwróciła się du funkcji hello i przekazała łańcuch "world"
        hello("user"); // Tak jak powyżej, tylko została przekazay łańcuch "user"
        hello("Dominik");// Tak jak powyżej, tylko została przekazay łańcuch "Dominik"

        Square s = new Square();
        s.l = 5;
        System.out.println("Powierzchnia kwadratu o boku " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 5;
        r.b = 6;
        System.out.println("Powierzchnia prostąkąta o bokach  " + r.a + " i " + r.b + " = " + area(r));
    }

    public static void hello(String somebody) {                     // To jest funkcja
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (Square s) {
        return  s.l * s.l;
    }

    public static double area (Rectangle r) {
        return r.a * r.b;
    }
}