package pl.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
                                            /* W klasie, ktora zawiera test nie trzeba tworzyc metody main,
                                            poniewaz uruchamia sie framework testowy,w naszym przypadku to testng
                                            to on znajduje wszystkie testy
                                           i je wykonuje i generuje sprawozdanie */
    @Test
    public void testArea() {
        Square s = new Square(5);           // w metodzie testowej nie ma żadnego zwracanego wyników i paramterów, a o wynikach swojej pracy zawiadamia testowy framework

        Assert.assertEquals(s.area(), 25.0);
    }
}
