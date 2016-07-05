package de.davidgollasch.emiexercise2;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Spinner spContacts;
    private TextView
            tvTitle,
            tvFirstName,
            tvLastName,
            tvAddress,
            tvZip,
            tvCity,
            tvCountry;

    /*
    TODO: (TASK 2.2 and 3.3) Add required new UI widgets (EditTexts and Buttons) here
     */

    /*
    TODO: (TASK 2.1) Add data structure for contact details here
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(R.color.tuHausfarbeBlauDunkel)));

        InitializeApp();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeApp() {
        spContacts = (Spinner) findViewById(R.id.spinnerContacts);

        tvTitle = (TextView) findViewById(R.id.textViewTitle);
        tvFirstName = (TextView) findViewById(R.id.textViewFirstName);
        tvLastName = (TextView) findViewById(R.id.textViewLastName);
        tvAddress = (TextView) findViewById(R.id.textViewAddress);
        tvZip = (TextView) findViewById(R.id.textViewZip);
        tvCity = (TextView) findViewById(R.id.textViewCity);
        tvCountry = (TextView) findViewById(R.id.textViewCountry);

        /*
        TODO: (TASK 2.2 and 3.3) Bind required new UI widgets (EditTexts and Buttons) here
         */


        /*
        TODO: (TASK 2.1) Fill contacts

        IMPORTANT: Fill the list with at least one item. Else, the spinner could look empty for some reason.

        1. create list of contacts

        2. create ArrayAdapter adapter

        3. spContacts.setAdapter(adapter);
         */

        /*
        Herr Robert Meyer       Frau Elisabeth Stramm       Herr Stefan Wennige
        Apfelbergstraße 10      Fritz-Konzert-Straße 1a     Kirchplatz 13
        9430 St. Margrethen     6020 Innsbruck              6112 Wattens
        Schweiz                 Österreich                  Österreich


        Frau Ella Beckmann      Frau Anne Watson
        Falkenstraße 3          1 Langdon Park Rd
        01067 Dresden           London N6 5PS
        Deutschland             Vereinigtes Königreich
         */


        spContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!(view instanceof TextView))
                    return;

                TextView item = (TextView) view;
                String selectedName = item.getText().toString();

                /*
                TODO: selectedName contains the selected spinner item as String Show

                Let's show the contact's details:
                 */
                DisplayContactDetails(selectedName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // do nothing
            }
        });
    }

    /**
     * Set the displayed contact details by contact name
     * @param contactName contact's name
     */
    private void DisplayContactDetails(String contactName) {

        // TODO: Get contact by selected name

        // TODO: Fill TextViews with contact details

        tvTitle.setText("");
        tvFirstName.setText("");
        tvLastName.setText("");
        tvAddress.setText("");
        tvZip.setText("");
        tvCity.setText("");
        tvCountry.setText("");
    }



}
