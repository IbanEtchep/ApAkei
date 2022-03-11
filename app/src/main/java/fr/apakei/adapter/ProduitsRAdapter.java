package fr.apakei.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.apakei.Produit;
import fr.apakei.R;

public class ProduitsRAdapter extends BaseAdapter {
    private final Context context;
    private List<Produit> produits;

    public ProduitsRAdapter(Context context, List<Produit> produits) {
        this.context = context;
        this.produits = produits;
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Produit getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lv_produitsr_element, parent, false);
        }

        Produit produit = (Produit) getItem(position);

        TextView tv_nomP = (TextView)
                convertView.findViewById(R.id.tv_nomP);
        TextView tv_descTech = (TextView)
                convertView.findViewById(R.id.tv_descTech);
        TextView tv_prix = (TextView)
                convertView.findViewById(R.id.tv_prix);

        tv_nomP.setText(produit.getNom());
        tv_descTech.setText(produit.getDescTech());
        tv_prix.setText(produit.getPrix()+"€");

        return convertView;
    }
}
