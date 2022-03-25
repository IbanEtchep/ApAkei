package fr.apakei.employe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.apakei.Modele;
import fr.apakei.R;

public class EmployeDetailActivity extends AppCompatActivity {
    private TextView nom;
    private TextView prenom;
    private TextView tel;
    private TextView mail;
    private TextView leRayon;
    private TextView leMagasin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe_detail);
        Bundle bundleRecu = this.getIntent().getExtras();
        int positionemploye= (int) bundleRecu.getInt("positionemploye");
        int positionrayon= (int) bundleRecu.getInt("positionrayon");
        nom = (TextView) findViewById(R.id.tv_nom);
        prenom=(TextView) findViewById(R.id.tv_prenom);
        tel=(TextView) findViewById(R.id.tv_tel);
        mail=(TextView) findViewById(R.id.tv_mail);
        nom.setText(Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getNom());
        prenom.setText(Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getPrenom());
        tel.setText(Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getTel());
        mail.setText(Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getMail());
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