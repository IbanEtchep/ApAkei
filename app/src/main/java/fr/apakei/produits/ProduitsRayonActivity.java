package fr.apakei.produits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import fr.apakei.Modele;
import fr.apakei.Produit;
import fr.apakei.R;
import fr.apakei.Rayon;
import fr.apakei.adapter.ProduitsRAdapter;
import fr.apakei.adapter.RayonAdapter;

public class ProduitsRayonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produits_rayon);

        Bundle bundleRecu = this.getIntent().getExtras();
        int idRay=bundleRecu.getInt("ray");
        setTitle("Choisissez un produit");

        TextView tv_nomR=(TextView) findViewById(R.id.tv_nomR);
        tv_nomR.setText("Rayon "+Modele.getLeRayon(idRay).getLibelle());

        ListView lv_listP = (ListView)findViewById(R.id.lv_produits);

        ProduitsRAdapter ra_rayons = new ProduitsRAdapter(this, Modele.getLeRayon(idRay).getLesProduits());
        lv_listP.setAdapter(ra_rayons);

        // When the user clicks on the ListItem
        lv_listP.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv_listP.getItemAtPosition(position);
                Produit prod = (Produit) o;
                int numP=Modele.getLeRayon(idRay).getLesProduits().indexOf(prod);

                Intent intent = new Intent(getApplicationContext(), CaractProduitActivity.class);
                Bundle bundleR = new Bundle();
                bundleR.putInt("prod",numP);
                bundleR.putInt("ray",idRay);
                intent.putExtras(bundleR);
                startActivity(intent);

            }
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