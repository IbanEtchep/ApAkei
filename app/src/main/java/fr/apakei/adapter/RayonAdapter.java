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
    private final Context context;
    private List<Rayon> rayons;

    public RayonAdapter(Context context, List<Rayon> rayons) {
        this.context = context;
        this.rayons = rayons;
    }

    @Override
    public int getCount() {
        return rayons.size();
    }

    @Override
    public Rayon getItem(int i) {
        return rayons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.lv_rayons_element, parent, false);
        }

        Rayon rayon = (Rayon) getItem(position);

        TextView tv_nomR = (TextView)
                convertView.findViewById(R.id.tv_nomR);
        TextView tv_descR = (TextView)
                convertView.findViewById(R.id.tv_descR);

        tv_nomR.setText(rayon.getLibelle());
        tv_descR.setText(rayon.getDescriptif());

        return convertView;
    }

}
