package fr.apakei.produits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.Rayon;

public class ListRayonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rayons);

        ListView lv_listP = (ListView)findViewById(R.id.lv_employe);
        List<Rayon> lesRayons= Modele.getLesRayons();
        List<String> s_lesRayons=new ArrayList<>();


        for (Rayon ray : lesRayons) {
            s_lesRayons.add(ray.getLibelle());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayonmagasin_element, s_lesRayons);


        lv_listP.setAdapter(lv_adapter);


    }
}