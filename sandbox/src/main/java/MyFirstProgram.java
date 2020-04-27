public class MyFirstProgram {

    public static void main(String[] args)
    {
        //Nazwy klas zaczynamy zawsze wielką literą, a wszystko pozostałe, np. pakiety, funckje z małej
        hello("world");// Najpierw uruchomiła się funkcja main, która zwróciła się du funkcji hello i przekazała łańcuch "world"
        hello("user"); // Tak jak powyżej, tylko została przekazay łańcuch "user"
        hello("Dominik");// Tak jak powyżej, tylko została przekazay łańcuch "Dominik"

        Square s = new Square(5);
        System.out.println("Powierzchnia kwadratu o boku " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 5);
        System.out.println("Powierzchnia prostąkąta o bokach  " + r.a + " i " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {                     // To jest funkcja
        System.out.println("Hello, " + somebody + "!");
    }
}