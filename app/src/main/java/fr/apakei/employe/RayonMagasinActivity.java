package fr.apakei.employe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.Rayon;

public class RayonMagasinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayonmagasin);
        ListView lv_listP = (ListView)findViewById(R.id.lv_rayons);
        List<Rayon> lesRayons= Modele.getLesRayons();
        List<String> s_lesRayons=new ArrayList<>();
        for (int i=0;i< lesRayons.size();i++){
            s_lesRayons.add(Modele.getLeRayon(i).getLibelle());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayons_element, s_lesRayons);
        lv_listP.setAdapter(lv_adapter);
    }
}
