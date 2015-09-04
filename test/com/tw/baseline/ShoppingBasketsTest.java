package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingBasketsTest {

    @Test
    public void shouldHaveProducts() {
        ShoppingBaskets shoppingBaskets = new ShoppingBaskets();

        assertEquals(true, shoppingBaskets.productsList() != null);
    }
}