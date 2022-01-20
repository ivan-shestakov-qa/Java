package ru.stqa.pft.distance;

import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testArea(){
        Distance d = new Distance(7, 3);
        assert d.area() == 6.324555320336759;
    }
}
