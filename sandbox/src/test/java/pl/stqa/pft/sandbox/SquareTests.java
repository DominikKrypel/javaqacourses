package pl.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class SquareTests {                      /* W klasie, ktora zawiera test nie trzeba tworzyc metody main,
                                                 poniewaz uruchamia sie framework testowy,w naszym przypadku to testng
                                                 to on znajduje wszystkie testy
                                                i je wykonuje i generuje sprawozdanie */
    @Test
    public void testArea()  {
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
