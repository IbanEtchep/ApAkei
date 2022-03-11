package fr.apakei.employe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        int positionemploye= (int) bundleRecu.getFloat("positionemploye");
        int positionrayon= (int) bundleRecu.getFloat("positionrayon");
        nom = (TextView) findViewById(R.id.tv_nom);
        prenom=(TextView) findViewById(R.id.tv_prenom);
        tel=(TextView) findViewById(R.id.tv_tel);
        mail=(TextView) findViewById(R.id.tv_mail);
        nom.setText("Nom : "+Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getNom());
        prenom.setText("Prenom : "+Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getPrenom());
        tel.setText("Tel : "+Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getTel());
        mail.setText("Mail : "+Modele.getLeRayon(positionrayon).getEmploye(positionemploye).getMail());
    }
}