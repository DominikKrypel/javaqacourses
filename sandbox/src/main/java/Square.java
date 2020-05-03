public class Square { //wewnątrz klasy Square niezbędnie trzeba opisać...

    public double l; // ... atrybuty, które posiada obiekt tego typu.

    public Square(double l) {  //to jest konstruktor
        this.l = l;    /*this - to jest ten obiekt, ktory inicjalizuje sie w instruktorze
         pierwsze l to jest atrybut, drugie l to zmienna, ktora ogloszona
         jest jako argument funkcji */
    }

    public double area() {                   //--to jest metoda
        return this.l * this.l;
    }

    /*public static double area(Square s) {    -- to jest funkcja
     return s.l * s.l;     }  */
}