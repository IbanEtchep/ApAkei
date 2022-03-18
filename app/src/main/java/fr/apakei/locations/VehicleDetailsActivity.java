package fr.apakei.locations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import fr.apakei.Magasin;
import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.Vehicule;

public class VehicleDetailsActivity extends AppCompatActivity {

    private TextView tv_nom;
    private TextView tv_marque;
    private TextView tv_carburant;
    private TextView tv_kilometrage;
    private TextView tv_immat;
    private TextView tv_longueur;
    private TextView tv_largeur;
    private TextView tv_hauteur;
    private TextView tv_volume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_details);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Bundle bundleReceived = this.getIntent().getExtras();
        int magasinIndex = bundleReceived.getInt("magasinIndex");
        int vehiculeIndex = bundleReceived.getInt("vehicleIndex");
        Log.d("index", magasinIndex + " " + vehiculeIndex);
        Magasin magasin = Modele.getLesMagasins().get(magasinIndex);
        Vehicule vehicule = magasin.getVehicule(vehiculeIndex);

        setTitle(vehicule.toString());

        tv_nom = findViewById(R.id.tv_nom_vehicule);
        tv_marque = findViewById(R.id.tv_marque_vehicule);
        tv_immat = findViewById(R.id.tv_immatriculation_vehicule);
        tv_kilometrage = findViewById(R.id.tv_kilometrage_vehicule);
        tv_carburant = findViewById(R.id.tv_carburant_vehicule);
        tv_longueur = findViewById(R.id.tv_longueur_vehicule);
        tv_largeur = findViewById(R.id.tv_largeur_vehicule);
        tv_hauteur = findViewById(R.id.tv_hauteur_vehicule);
        tv_volume = findViewById(R.id.tv_volume_vehicule);

        tv_nom.append(vehicule.getNom());
        tv_marque.append(vehicule.getMarque());
        tv_immat.append(vehicule.getPlaqueImma());
        tv_carburant.append(vehicule.getTypeCarburant());
        tv_kilometrage.append(vehicule.getNbKmActuel()+" km");
        tv_longueur.append(vehicule.getLongueur()+" cm");
        tv_hauteur.append(vehicule.getHauteur()+" cm");
        tv_largeur.append(vehicule.getLargeur()+" cm");
        tv_volume.append(vehicule.getVolume()+" m³");
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