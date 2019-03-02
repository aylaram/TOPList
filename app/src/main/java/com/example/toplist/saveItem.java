package com.example.toplist;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class saveItem extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void check(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "topList", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String itemName = et1.getText().toString();
        Cursor row = bd.rawQuery(
                "select itemName from items where itemName=" + itemName, null);
        if (row.getCount()!=1) {
            //save(v);
        } else {
            tv1.setText("It's repeated");
        }
        bd.close();
    }

    public void save(View v) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
                "topList", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String itemName = et1.getText().toString();
        ContentValues item = new ContentValues();
        item.put("itemName", itemName);
        bd.insert("items", null, item);
        tv1.setText("Saved");
        bd.close();
    }
}
