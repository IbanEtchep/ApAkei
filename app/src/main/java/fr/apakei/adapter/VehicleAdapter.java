package fr.apakei.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import fr.apakei.R;
import fr.apakei.Vehicule;

public class VehicleAdapter extends BaseAdapter {

    private final Context context;
    private List<Vehicule> vehicules;

    public VehicleAdapter(Context context, List<Vehicule> vehicules) {
        this.context = context;
        this.vehicules = vehicules;
    }

    @Override
    public int getCount() {
        return vehicules.size();
    }

    @Override
    public Vehicule getItem(int i) {
        return vehicules.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.vehicle_element, parent, false);
        }

        Vehicule vehicule = (Vehicule) getItem(position);

        TextView nameTextView = (TextView)
                convertView.findViewById(R.id.tv_name);
//        TextView marqueTextView = (TextView)
//                convertView.findViewById(R.id.tv_marque);
//        TextView carburantTextView = (TextView)
//                convertView.findViewById(R.id.tv_carburant);

        nameTextView.setText(vehicule.toString());
//        marqueTextView.setText(vehicule.getMarque());
//        carburantTextView.setText(vehicule.getTypeCarburant());

        return convertView;
    }
}
