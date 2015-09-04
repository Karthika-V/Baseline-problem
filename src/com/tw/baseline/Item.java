//Items with Name, Price and quantity should have Receipt
package com.tw.baseline;

public class Item {

    private String itemName;
    private double itemPrice;
    private int itemQty;
    private String category;

    public Item(String itemName, double itemPrice, int itemQty) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
    }

    public String findItemCategory(Item item) {
        if(item.itemName.contentEquals("book")) {
            category="book";
        }
        return category;
    }
}
