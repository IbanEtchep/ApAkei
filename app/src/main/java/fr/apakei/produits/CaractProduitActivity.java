package fr.apakei.produits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import fr.apakei.Modele;
import fr.apakei.Produit;
import fr.apakei.R;
import fr.apakei.adapter.ProduitsRAdapter;

public class CaractProduitActivity extends AppCompatActivity {
    private TextView tv_nomp;
    private TextView tv_desc;
    private TextView tv_dim;
    private TextView tv_prix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caract_produit);

        //Récupération de l'id du produit et du rayon sélectionnés précedemment
        Bundle bundleRecu = this.getIntent().getExtras();
        int idProd=bundleRecu.getInt("prod");
        int idRay=bundleRecu.getInt("ray");

        //Récupération du produit sélectionné selon son id et l'id du rayon
        Produit prod=Modele.getLeRayon(idRay).getProduit(idProd);
        setTitle(prod.getNom());

        tv_nomp=(TextView) findViewById(R.id.tv_detail_nomP);
        tv_desc=(TextView) findViewById(R.id.tv_detail_desc);
        tv_dim=(TextView) findViewById(R.id.tv_detail_dim);
        tv_prix=(TextView) findViewById(R.id.tv_detail_prix);

        tv_nomp.setText(prod.getNom());
        tv_desc.setText(prod.getDescTech()+", "+prod.getCouleur());
        tv_dim.setText("H"+prod.getHauteur()+"xL"+prod.getLongueur()+"xl"+prod.getLargeur());
        tv_prix.setText(prod.getPrix()+"€");
    }

    // this event will enable the back
    // function to the button on press
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