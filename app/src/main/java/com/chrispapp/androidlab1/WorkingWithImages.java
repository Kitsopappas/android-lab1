package com.chrispapp.androidlab1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class WorkingWithImages extends AppCompatActivity {

    private ImageButton google,facebook,twitter,linkedin;
    private ListView list;
    // Defined Array values to show in ListView
    String[] values = new String[] {
            "Data Structures",
            "Databases",
            "Java OOP",
            "Parallel Programming",
            "Networks",
            "Web Structure",
            "Operating Systems",
            "Machine Learning"
    };

    String[]  outValues = new String[] {
            "Sioutas",
            "Sioutas",
            "Theotokis",
            "Stefanidakis",
            "Oikonomou",
            "Tsoumakos",
            "Tsoumakos",
            "Kermanidou"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working_with_images);
        addGUIComponents();
        clickListener(google, "https://www.google.com");
        clickListener(facebook, "https://www.facebook.com/");
        clickListener(twitter, "https://twitter.com/");
        clickListener(linkedin, "https://www.linkedin.com/");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        list.setAdapter(adapter);

        // ListView Item Click Listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) list.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Lesson :" + itemValue + "  Teacher : " + outValues[itemPosition], Toast.LENGTH_LONG)
                        .show();

            }

        });

    }


    /*
       Adding the gui components to use later
    */
    protected void addGUIComponents() {
        google = (ImageButton) findViewById(R.id.google);
        facebook = (ImageButton) findViewById(R.id.facebook);
        twitter = (ImageButton) findViewById(R.id.twitter);
        linkedin = (ImageButton) findViewById(R.id.linkedin);
        list = (ListView) findViewById(R.id.listView);
    }

    protected void clickListener(ImageButton b,final String url){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
        });
    }
}
