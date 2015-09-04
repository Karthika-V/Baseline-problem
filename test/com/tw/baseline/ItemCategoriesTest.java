package com.tw.baseline;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ItemCategoriesTest {

    @Test
    public void shouldIncludeFoodAsCategory() {
        ItemCategories itemCategories = new ItemCategories();

        String[] category = itemCategories.categoriesList();

        assertEquals(true, Arrays.asList(category).contains("food"));
    }

}