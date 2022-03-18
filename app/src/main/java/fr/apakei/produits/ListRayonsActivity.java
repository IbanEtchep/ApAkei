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

import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.Rayon;
import fr.apakei.adapter.RayonAdapter;

public class ListRayonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rayons);

        ListView lv_listR = (ListView)findViewById(R.id.lv_rayonsR);

        RayonAdapter ra_rayons = new RayonAdapter(this, Modele.getLesRayons());
        lv_listR.setAdapter(ra_rayons);

        // When the user clicks on the ListItem
        lv_listR.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv_listR.getItemAtPosition(position);
                Rayon rayon = (Rayon) o;

                int numR=Modele.getLesRayons().indexOf(rayon);

                Intent intent = new Intent(getApplicationContext(), ProduitsRayonActivity.class);
                Bundle bundleR = new Bundle();
                bundleR.putInt("ray",numR);
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