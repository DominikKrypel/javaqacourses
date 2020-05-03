public class Square { //wewnątrz klasy Square niezbędnie trzeba opisać...

    public double l; // ... atrybuty, które posiada obiekt tego typu.

    public Square(double l) {  //to jest konstruktor
       this.l = l;    //this - to jest ten obiekt, ktory inicjalizuje sie w instruktorze
                       //
    }

    public double area() {
        return  this.l * this.l;
    }
}
