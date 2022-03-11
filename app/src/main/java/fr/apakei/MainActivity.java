package fr.apakei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import fr.apakei.employe.RayonMagasinActivity;
import fr.apakei.locations.LocationListActivity;
import fr.apakei.produits.ListRayonsActivity;

public class MainActivity extends AppCompatActivity {

    private Button locationButton;
    private Button btn_employe;
    private Button btn_rayons;

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

        btn_employe = findViewById(R.id.btn_employe);
        btn_employe.setOnClickListener(click -> {
            Intent intent = new Intent(getApplicationContext(), RayonMagasinActivity.class);
            startActivity(intent);
        });

        btn_rayons = findViewById(R.id.btn_rayons);
        btn_rayons.setOnClickListener(click -> {
            Intent intent = new Intent(getApplicationContext(), ListRayonsActivity.class);
            startActivity(intent);
        });

    }

}