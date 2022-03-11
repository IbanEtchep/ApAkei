package fr.apakei.locations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
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
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle("Choisissez un véhicule");

        Bundle bundleReceived = this.getIntent().getExtras();
        int magasinIndex = bundleReceived.getInt("magasinIndex");
        Magasin magasin = Modele.getLesMagasins().get(magasinIndex);

        ListView listView = (ListView) findViewById(R.id.list_vehicules);
        VehicleAdapter vehicleAdapter = new VehicleAdapter(this, magasin.getLesVehicules());
        listView.setAdapter(vehicleAdapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(this, VehicleDetailsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("magasinIndex", magasinIndex);
            bundle.putInt("vehicleIndex", i);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}