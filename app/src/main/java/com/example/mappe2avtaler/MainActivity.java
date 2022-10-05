package com.example.mappe2avtaler;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText navninn, telefoninn, idinn;
    TextView utskrift;
    DBHandler dbHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navninn = (EditText) findViewById(R.id.navn);
        telefoninn = (EditText) findViewById(R.id.tlf);
        idinn = (EditText) findViewById(R.id.min_id);
        utskrift = (TextView) findViewById(R.id.utskrift);
        dbHelper = new DBHandler(this);
        db = dbHelper.getWritableDatabase();

    }

    public void leggtil(View v) {
    }

    public void visalle(View v) {
    }

    public void slett(View v) {
    }

    public void oppdater(View v) {
    }
}
