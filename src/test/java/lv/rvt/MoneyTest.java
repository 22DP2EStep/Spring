package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {
    @Test
    public void testPlusMetode(){
        int c = 2 + 2;
        Money macins1 = new Money(10, 5);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);
        assertEquals(15,macins3.euros());
        assertEquals(95,macins3.cents());


    }
}
