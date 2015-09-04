package com.tw.baseline;

import org.junit.Test;

public class SalestaxesTest {

    @Test
    public void shouldBeCalculatedForAllShoppingBaskets() {
        Salestaxes salestaxes = new Salestaxes();
        salestaxes.shoppingBaskets();
    }
}