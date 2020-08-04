package pl.stqa.pft.sandbox;

public class MyFirstProgram { //Klasa to opis struktury tego samego typu obieków,
                              // które nazywają się przedstawicielami tej klasy albo egzemplarzami tej klasy

    //Funckja to nazwany jakis fragment kodu
    //Metoda to funkcja zwiazana albo kojarzona z jakims obiektem, kazda Metoda jest funkcja,...
    // ... ale nie kazda Funckja jest Metoda

    public static void main(String[] args) {
        //Nazwy klas zaczynamy zawsze wielką literą, a wszystko pozostałe,...
        // ...np. pakiety, funkcje z małej

        hello("world");// Najpierw uruchomiła się funkcja main,...
        //...która zwróciła si ę du funkcji hello i przekazała łańcuch "world"

        hello("user"); // Tak jak powyżej, tylko została przekazay łańcuch 3ew"user"
        hello("tester");// Tak jak powyżej, tylko została przekazay łańcuch "51 Dominik"

        Square s = new Square(5); // przenosimy wartosci parametrow, uzupelniane sa w konstruktorze
        System.out.println("Powierzchnia kwadratu o boku " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(5, 5);
        System.out.println("Powierzchnia prostąkąta o bokach  " + r.a + " i " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {                     // To jest funkcja , w nawiasie
                                                                    // (String somebody) to jest parametr albo argument funkcji
        System.out.println("Hello, " + somebody + "!");
    }
}