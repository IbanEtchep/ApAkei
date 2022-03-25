package fr.apakei.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.apakei.Rayon;
import fr.apakei.R;

public class RayonAdapter extends BaseAdapter {
    private final Context context; //context
    private List<Rayon> rayons; //data source of the list adapter

    //public constructor
    public RayonAdapter(Context context, List<Rayon> rayons) {
        this.context = context;
        this.rayons = rayons;
    }

    @Override
    public int getCount() {
        return rayons.size(); //returns total of items in the list
    }

    @Override
    public Rayon getItem(int i) {
        return rayons.get(i); //returns list item at the specified position
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lv_rayons_element, parent, false);
        }

        // get current item to be displayed
        Rayon rayon = (Rayon) getItem(position);

        // get the TextView for items
        TextView tv_nomR = (TextView)
                convertView.findViewById(R.id.tv_nomR);
        TextView tv_descR = (TextView)
                convertView.findViewById(R.id.tv_descR);

        //sets the text for items from the current item object
        tv_nomR.setText(rayon.getLibelle());
        tv_descR.setText(rayon.getDescriptif());

        // returns the view for the current row
        return convertView;
    }

}
