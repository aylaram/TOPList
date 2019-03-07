package com.example.toplist;

import android.view.View;
import java.util.*;

public class AllList {

    List<ShoppingList> all;

    public List<ShoppingList> getAll() {
        return all;
    }

    public AllList() {
        all = new ArrayList<>();
    }

    public AllList(List<ShoppingList> all) {
        this.all = all;
    }
}