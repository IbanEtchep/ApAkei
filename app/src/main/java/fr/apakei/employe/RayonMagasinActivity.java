package fr.apakei.employe;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import fr.apakei.Modele;
import fr.apakei.R;

public class RayonMagasinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayonmagasin);
        LinearLayout layout = (LinearLayout) findViewById(R.id. linear1);
        for (int i=0;i< Modele.getLesRayons().size();i++){
            Button btn = new Button(this);
            btn.setText(Modele.getLeRayon(i).getLibelle());
            layout.addView(btn);
        }
    }
}
