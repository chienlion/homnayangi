package adapter;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.anonymous.homnayangi.R;
import com.example.anonymous.homnayangi.SavedFragment;


import java.util.List;
import java.util.zip.Inflater;

import model.Restaurants;

public class AdapterSaved extends ArrayAdapter<Restaurants>{

    private List<Restaurants> list;
    private LayoutInflater inflater;
    private Context context;

    public AdapterSaved(@NonNull Context context, int resource, @NonNull List<Restaurants> objects) {
        super(context, resource, objects);

        this.list = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder2 holder;
        if(convertView==null){

            holder = new ViewHolder2();
            convertView = inflater.inflate(R.layout.item_saved,parent,false);

            holder.imgSavedRestaurant = convertView.findViewById(R.id.imgRestaurantNotification);
            holder.tvTitle = convertView.findViewById(R.id.tvTitle);
            holder.tvAddress = convertView.findViewById(R.id.tvAddress);
            holder.tvSpecies = convertView.findViewById(R.id.tvSpecies);
            holder.tvTimeSave = convertView.findViewById(R.id.tvTimeSave);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder2)convertView.getTag();
        }

        final Restaurants rs = list.get(position);
//        holder.imgSavedRestaurant.setImageResource(rs.getImage());
        holder.tvTitle.setText(rs.getTitle());
        holder.tvAddress.setText(rs.getAddress());
        holder.tvSpecies.setText(rs.getSpecies());
        holder.tvTimeSave.setText(rs.getTimeSave());

        return convertView;

    }

    public static class ViewHolder2{
        public ImageView imgSavedRestaurant;
        public TextView tvSpecies;
        public TextView tvTitle;
        public TextView tvAddress;
        public TextView tvTimeSave;

    }
}
