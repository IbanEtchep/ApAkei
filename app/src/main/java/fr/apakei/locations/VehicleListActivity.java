package fr.apakei.locations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import fr.apakei.Magasin;
import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.adapter.MagasinAdapter;
import fr.apakei.adapter.VehicleAdapter;

public class VehicleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_list);
        setTitle("Choisissez un véhicule");

        Bundle bundle = this.getIntent().getExtras();
        int magasinIndex = bundle.getInt("magasinIndex");
        Magasin magasin = Modele.getLesMagasins().get(magasinIndex);

        ListView listView = (ListView) findViewById(R.id.list_vehicules);
        VehicleAdapter vehicleAdapter = new VehicleAdapter(this, magasin.getLesVehicules());
        listView.setAdapter(vehicleAdapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
//            Intent intent = new Intent(this, VehicleListActivity.class);
//            Bundle bundle = new Bundle();
//            bundle.putInt("vehicleIndex", i);
//            intent.putExtras(bundle);
//            startActivity(intent);
        });
    }

}