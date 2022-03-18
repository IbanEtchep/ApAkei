package fr.apakei.employe;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Modele;
import fr.apakei.R;
import fr.apakei.Rayon;

public class RayonMagasinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayonmagasin);
        ListView lv_listR = (ListView)findViewById(R.id.lv_rayonsR);
        List<Rayon> lesRayons= Modele.getLesRayons();
        List<String> s_lesRayons=new ArrayList<>();
        for (int i=0;i< lesRayons.size();i++){
            s_lesRayons.add(Modele.getLeRayon(i).getLibelle());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayons_element, s_lesRayons);
        lv_listR.setAdapter(lv_adapter);
        lv_listR.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                String value = (String)adapter.getItemAtPosition(position);
                Intent intent= new Intent(getApplicationContext(),EmployeListActivity.class);
                Bundle bundleATransmettre = new Bundle();
                bundleATransmettre.putFloat("positionrayon",position);
                intent.putExtras(bundleATransmettre);
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
