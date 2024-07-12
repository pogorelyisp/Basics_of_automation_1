package ru.netology.repo;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

import static org.testng.Assert.assertEquals;


class CashBackHackerTest {

    @org.testng.annotations.Test
    public void shouldCalculateLessThan1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateMoreThan1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);


    }

    @org.testng.annotations.Test
    public void shouldCalculateEqualTo1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }
}