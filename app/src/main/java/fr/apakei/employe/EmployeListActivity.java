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

public class EmployeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe_list);
        ListView lv_list = (ListView)findViewById(R.id.lv_rayons);
        Bundle bundleRecu = this.getIntent().getExtras();
        int positiona= (int) bundleRecu.getFloat("positionrayon");
        List<String> lesEmployees=new ArrayList<>();
        for (int i=0;i< Modele.getLeRayon(positiona).getLesEmployes().size();i++){
            lesEmployees.add(Modele.getLeRayon(positiona).getEmploye(i).getNom()+" "+Modele.getLeRayon(positiona).getEmploye(i).getPrenom());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayons_element, lesEmployees);
        lv_list.setAdapter(lv_adapter);
        lv_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                String value = (String)adapter.getItemAtPosition(position);
                Intent intent= new Intent(getApplicationContext(),EmployeDetailActivity.class);
                Bundle bundleATransmettre = new Bundle();
                bundleATransmettre.putInt("positionemploye",position);
                bundleATransmettre.putInt("positionrayon",positiona);
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
