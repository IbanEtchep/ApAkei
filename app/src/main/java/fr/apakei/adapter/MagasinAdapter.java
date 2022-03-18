package fr.apakei.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.apakei.Magasin;
import fr.apakei.R;

public class MagasinAdapter extends BaseAdapter {

    private final Context context;
    private List<Magasin> magasins;

    public MagasinAdapter(Context context, List<Magasin> magasins) {
        this.context = context;
        this.magasins = magasins;
    }

    @Override
    public int getCount() {
        return magasins.size();
    }

    @Override
    public Magasin getItem(int i) {
        return magasins.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.magasin_element, parent, false);
        }

        Magasin magasin = (Magasin) getItem(position);

        TextView nameTextView = (TextView)
                convertView.findViewById(R.id.tv_magasin_name);
        TextView addressTextView = (TextView)
                convertView.findViewById(R.id.tv_adresse_magasin);

        nameTextView.setText(magasin.getNom());
        addressTextView.setText(magasin.getAdresse() + " " + magasin.getCp() + " " + magasin.getVille());

        return convertView;
    }
}
