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
    private final Context context; //context
    private List<Produit> produits; //data source of the list adapter

    //public constructor
    public ProduitsRAdapter(Context context, List<Produit> produits) {
        this.context = context;
        this.produits = produits;
    }

    @Override
    public int getCount() {
        return produits.size(); //returns total of items in the list
    }

    @Override
    public Produit getItem(int i) {
        return produits.get(i); //returns list item at the specified position
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lv_produitsr_element, parent, false);
        }

        // get current item to be displayed
        Produit produit = (Produit) getItem(position);

        // get the TextView for items
        TextView tv_nomP = (TextView)
                convertView.findViewById(R.id.tv_nomP);
        TextView tv_descTech = (TextView)
                convertView.findViewById(R.id.tv_descTech);
        TextView tv_prix = (TextView)
                convertView.findViewById(R.id.tv_prix);

        //sets the text for items from the current item object
        tv_nomP.setText(produit.getNom());
        tv_descTech.setText(produit.getDescTech());
        tv_prix.setText(produit.getPrix()+"€");

        // returns the view for the current row
        return convertView;
    }
}
