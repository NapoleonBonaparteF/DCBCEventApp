package com.dcbc.scs_admin.dcbceventapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class CreateEventActivity extends AppCompatActivity {

    //ArrayList<Event> events = new ArrayList<Event>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_event_list);


        final Button sendButton = findViewById(R.id.send_id);
        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  here executes on thread user presses button main Code

                // get all the fields
                final TextView toTV = findViewById(R.id.to);
                String to = toTV.getText().toString();

//                final TextView toTV = findViewById(R.id.from);
//                String from = toTV.getText().toString();

                final TextView subjectTV = findViewById(R.id.subject);
                String subject = subjectTV.getText().toString();

                final TextView messageTV = findViewById(R.id.message);
                String message = messageTV.getText().toString();

//                final TextView toTV = findViewById(R.id.important);
//                String important = toTV.getText().toString();
                // create new event
                Event e = new Event(to, "from", subject, message, "important");

                // save event
                EventListActivity.events.add(e);

                // close this activity
                finish();

            }
        });

        /*final CheckBox checkBox = (CheckBox) findViewById(R.id.flag_id);
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
            }
        }*/

        /*final ToggleButton toggle = findViewById(R.id.flag_id);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

        flagButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                objectInputStream.getField(boolean(this.flag));
                flagButton.gets

            }
        });*/
    }
}
