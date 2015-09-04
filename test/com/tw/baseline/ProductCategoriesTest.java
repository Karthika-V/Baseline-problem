package com.tw.baseline;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductCategoriesTest {

    @Test
    public void shouldIncludeFoodAsCategory() {
        ProductCategories productCategories = new ProductCategories();

        String[] category = productCategories.categoriesList();

        assertEquals(true, Arrays.asList(category).contains("food"));
    }

}