package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {
    @Test
    public void testPlusMetode(){
        
        Money macins1 = new Money(10, 5);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);
        assertEquals(15,macins3.euros());
        assertEquals(95,macins3.cents());

        Money macins4 = new Money(10, 50);
        Money macins5 = new Money(5, 10);
        Money macins6 = macins4.minus(macins5);
        assertEquals(5, macins6.euros());
        assertEquals(40, macins6.cents());

        Money macins7 = new Money(10, 0);
        Money macins8 = new Money(5, 0);
        Boolean macins9 = macins7.lessThan(macins8);
        assertEquals(false, macins9);
        
    }
}
