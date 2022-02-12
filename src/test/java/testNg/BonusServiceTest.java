package testNg;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceTest {

    @Test
    public void testCalculateBonus() {
        BonusService bonusService = new BonusService();

        int amount = 2000;
        int expected = 10;
        int actual = bonusService.calculateBonus(amount);
        assertEquals(expected, actual, "Wrong bonus calc ");

    }
}