package com.dcbc.scs_admin.dcbceventapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EventListActivity extends AppCompatActivity {

    public static ArrayList<Event> events = new ArrayList<Event>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        events.add(new Event("to", "test from", "test subject", "test message", "not important"));
        events.add(new Event("test to 2", "test from 2", "test subject 2", "test message 2", "not important 2"));



        final Intent myIntent = new Intent(this, CreateEventActivity.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // link to create activity

                startActivity(myIntent);
            }
        });


        /*
         * We’ll be creating this EventAdapter in the next step
         */
        EventAdapter adapter = new EventAdapter(this, events);
        ListView listView = findViewById(R.id.list_view1);      // note this view ID is the one that was referred to in the XML layout above
        listView.setAdapter(adapter);

        final Button button = findViewById(R.id.close_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(myIntent);
            }
        });

    }

}
