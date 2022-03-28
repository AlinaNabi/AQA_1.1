package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
  public void shouldCashbackPurchaseAmountOnBoundary1000() {
      //  CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
   public void shouldCashbackPurchaseAmountMoreBoundary() {
     //   CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCashbackPurchaseAmountLowerBoundary() {
      //  CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        assertEquals(actual, expected);
    }

    @Test
   public void shouldCashbackPurchaseAmountUnderBoundary() {
      //  CashbackHackService service = new CashbackHackService();

        int expected = 5;
        int actual = service.remain(995);

        assertEquals(actual, expected);
    }

    @Test
   public void shouldCashbackPurchaseAmount0() {
      //  CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }
}