package com.example.toplist;

import java.util.*;

public class ShoppingList {
    private String name;
    private Date dat;
    private List<Items> items;

    public ShoppingList(String name, Date dat, List<Items> items) {
        this.name = name;
        this.dat = dat;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDat() {
        return dat;
    }

    public void setDat(Date dat) {
        this.dat = dat;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}