package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldHaveItemNameAndItemPriceAndItemQty() {
        Item item = new Item("book",12.49,1);

        assertEquals(true, !(item.toString().isEmpty()));
    }

}