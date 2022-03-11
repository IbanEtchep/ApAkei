package fr.apakei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import fr.apakei.locations.LocationListActivity;

public class MainActivity extends AppCompatActivity {

    private Button locationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modele.init();

        locationButton = findViewById(R.id.btn_locations);
        locationButton.setOnClickListener(click -> {
            Intent intent = new Intent(getApplicationContext(), LocationListActivity.class);
            startActivity(intent);
        });

    }

}