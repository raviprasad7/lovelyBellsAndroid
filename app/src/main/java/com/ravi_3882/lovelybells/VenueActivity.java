package com.ravi_3882.lovelybells;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VenueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue);
        String[] venueList = {"Use Current Location","Adyar","Chetpet","K.K.Nagar","Nungambakkam","T.Nagar"};

        ListView listView = (ListView) findViewById(R.id.venue_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, venueList);
        listView.setAdapter(arrayAdapter);

    }
}
