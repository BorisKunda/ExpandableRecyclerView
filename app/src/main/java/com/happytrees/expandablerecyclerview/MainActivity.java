package com.happytrees.expandablerecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = findViewById(R.id.recyclerView);
        RecyclerDataAdapter recyclerDataAdapter = new RecyclerDataAdapter(getDummyDataToPass());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(recyclerDataAdapter);
        mRecyclerView.setHasFixedSize(true);
    }

    private ArrayList<DummyParentDataItem> getDummyDataToPass() {


        ArrayList<DummyParentDataItem> dummyParentDataItems = new ArrayList<>();
        ArrayList<DummyChildDataItem> dummyChildDataItems = new ArrayList<>();


        //PARENT
        DummyParentDataItem dummyParentDataItem = new DummyParentDataItem();
        dummyParentDataItem.setParentName("Parent");

        //child 1
        DummyChildDataItem dummyChildDataItem = new DummyChildDataItem();
        dummyChildDataItem.setChildName("Child Item 1");
        dummyChildDataItems.add(dummyChildDataItem);
        //child 2
        DummyChildDataItem dummyChildDataItem2 = new DummyChildDataItem();
        dummyChildDataItem2.setChildName("Child Item 2");
        dummyChildDataItems.add(dummyChildDataItem2);
        //child 3
        DummyChildDataItem dummyChildDataItem3 = new DummyChildDataItem();
        dummyChildDataItem3.setChildName("Child Item 3");
        dummyChildDataItems.add(dummyChildDataItem3);
        //child 4
        DummyChildDataItem dummyChildDataItem4 = new DummyChildDataItem();
        dummyChildDataItem4.setChildName("Child Item 4");
        dummyChildDataItems.add(dummyChildDataItem4);
        ///child 5
        DummyChildDataItem dummyChildDataItem5 = new DummyChildDataItem();
        dummyChildDataItem5.setChildName("Child Item 5");
        dummyChildDataItems.add(dummyChildDataItem5);

        dummyParentDataItem.setChildDataItems(dummyChildDataItems);
        dummyParentDataItems.add(dummyParentDataItem);


        //PARENT 2,3 ....

        return dummyParentDataItems;
    }
}