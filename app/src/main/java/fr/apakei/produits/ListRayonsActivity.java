package fr.apakei.produits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rayons);

        ListView lv_listR = (ListView)findViewById(R.id.lv_rayons);
        /*List<Rayon> lesRayons= Modele.getLesRayons();
        List<String> s_lesRayons=new ArrayList<>();


        for (Rayon ray : lesRayons) {
            s_lesRayons.add(ray.getLibelle());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayonmagasin_element, s_lesRayons);


        lv_listP.setAdapter(lv_adapter);*/

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
}