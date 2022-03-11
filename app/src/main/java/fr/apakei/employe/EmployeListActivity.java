package fr.apakei.employe;

import android.os.Bundle;
import android.view.MenuItem;
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
        ListView lv_list = (ListView)findViewById(R.id.lv_employe);
        Bundle bundleRecu = this.getIntent().getExtras();
        int position= (int) bundleRecu.getFloat("position");
        List<String> lesEmployees=new ArrayList<>();
        for (int i=0;i< Modele.getLeRayon(position).getLesEmployes().size();i++){
            lesEmployees.add(Modele.getLeRayon(position).getEmploye(i).getNom());
        }
        ArrayAdapter<String> lv_adapter = new ArrayAdapter<String>(this, R.layout.lv_rayons_element, lesEmployees);
        lv_list.setAdapter(lv_adapter);
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
