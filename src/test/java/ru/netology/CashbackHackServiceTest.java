package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void Test() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(2800), 200);
    }

    @Test
    public void Test2() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void Test3() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}