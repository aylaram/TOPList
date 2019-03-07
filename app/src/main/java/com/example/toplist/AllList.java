package com.example.toplist;

import android.view.View;
import java.util.*;

public class AllList {

    ArrayList<Object> Lists=new ArrayList<>();

    private void AddList(View newList) {
        int i=1;

        List Li=new List(i);
        Lists.add(Li);

        i++;
    }

    private void PrintLists() {
/*
        for () {
            System.out.println();
        }
*/
    }
}