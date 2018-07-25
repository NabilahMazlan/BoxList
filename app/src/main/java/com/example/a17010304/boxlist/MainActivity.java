package com.example.a17010304.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<BoxItem> alBoxList;
    CustomAdapter caBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBoxList = new ArrayList<>();

        BoxItem box1 = new BoxItem("blue");
        BoxItem box2 = new BoxItem("orange");
        BoxItem box3 = new BoxItem("brown");
        alBoxList.add(box1);
        alBoxList.add(box2);
        alBoxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBoxList);
        lvBox.setAdapter(caBox);

    }
}
