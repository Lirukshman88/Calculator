package com.example.android.calculator;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.NumberFormat;


/**
 * * This app displays a calculator.
 */
public class MainActivity extends ActionBarActivity {
    int numberOfCoffees = 0;
    double numberOfJuice = 0;
    int i = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        /**
         * This method is called when the order button is clicked.
         */
    }
    public void submitAdd(View view) {
        displayFinal(numberOfCoffees + numberOfJuice);
    }

    public void submitSub(View view) {
        displayFinal(numberOfCoffees - numberOfJuice);
    }

    public void submitMul(View view) {
        displayFinal(numberOfCoffees * numberOfJuice);
    }

    public void submitDiv(View view) {
        displayFinal(numberOfCoffees / numberOfJuice);
    }

    public void submitsquare(View view) {
        displayFinal(numberOfCoffees * numberOfCoffees);
    }

    public void submitpercent(View view) {
        displayFinal(numberOfCoffees * 0.01);
    }

    public void submitAC(View view) {
        numberOfCoffees = 0;
        numberOfJuice = 0;
        displayFirst(numberOfCoffees);
        displaySecond(numberOfJuice);
        displayFinal(0);
    }

    public void submitroot(View view) {
        for (i = 1; i < numberOfCoffees; i++) {
            int n = (int) (numberOfCoffees / i);

            if (i == n) {
                displayFinal(i);
            }
        }

    }

    public void submitsymbol(View view) {
        numberOfCoffees = (numberOfCoffees * (-1));
        displayFirst(numberOfCoffees);
    }

    public void submitsymbol1(View view) {
        numberOfJuice = (numberOfJuice * (-1));
        displaySecond(numberOfJuice);
    }


    public void increment(View view) {
        numberOfCoffees = numberOfCoffees + 1;
        displayFirst(numberOfCoffees);
    }

    public void decrement(View view) {
        numberOfCoffees = numberOfCoffees - 1;
        displayFirst(numberOfCoffees);
    }

    public void increase(View view) {
        numberOfJuice = numberOfJuice + 1;
        displaySecond(numberOfJuice);
    }

    public void decrease(View view) {
        numberOfJuice = numberOfJuice - 1;
        displaySecond(numberOfJuice);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayFirst(double number) {
        TextView firstTextView = (TextView) findViewById(R.id.first_text_view);
        firstTextView.setText("" + number);

    }

    private void displaySecond(double number) {
        TextView secondTextView = (TextView) findViewById(R.id.second_text_view);
        secondTextView.setText("" + number);
    }

    private void displayFinal(double number) {
        TextView finalTextView = (TextView) findViewById(R.id.final_text_view);
        finalTextView.setText("" + number);
    }


}
