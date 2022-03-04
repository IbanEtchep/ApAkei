package fr.apakei.locations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Display;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Magasin;
import fr.apakei.Modele;
import fr.apakei.R;

public class LocationListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);

        ListView listView = (ListView) findViewById(R.id.list_magasins);
        List<Magasin> magasins = Modele.getLesMagasins();
        List<String> magasinsNames = new ArrayList<>();
        for (Magasin magasin : magasins) {
            magasinsNames.add(magasin.getNom());
        }
        ArrayAdapter<String> magasinArrayAdapter = new ArrayAdapter<String>(this, R.layout.list_element, magasinsNames);
        listView.setAdapter(magasinArrayAdapter);

    }
}