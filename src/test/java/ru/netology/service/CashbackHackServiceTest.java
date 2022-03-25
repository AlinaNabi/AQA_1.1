package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


class CashbackHackServiceTest {

    @Test
    void shouldCashbackPurchaseAmountOnBoundary1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackPurchaseAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }


    @Test
    void shouldCashbackPurchaseAmountLowerBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackPurchaseAmountUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 5;
        int actual = service.remain(995);

        assertEquals(actual, expected);
    }

    @Test
    void shouldCashbackPurchaseAmount0() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }
}