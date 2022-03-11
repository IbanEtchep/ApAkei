package fr.apakei.locations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Magasin;
import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.adapter.MagasinAdapter;

public class LocationListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);
        setTitle("Choisissez un magasin");

        ListView listView = (ListView) findViewById(R.id.list_magasins);
        MagasinAdapter magasinAdapter = new MagasinAdapter(this, Modele.getLesMagasins());
        listView.setAdapter(magasinAdapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(this, VehicleListActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("magasinIndex", i);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}