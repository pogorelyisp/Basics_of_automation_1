

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

import ru.netology.repo.CashBackHacker;

import static org.junit.Assert.assertEquals;
import static org.junit.Test.*;




public class CashBackHackerTest {

    @org.junit.Test
    public void shouldCalculateLessThan1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateMoreThan1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);


    }

    @org.junit.Test
    public void shouldCalculateEqualTo1000() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
}