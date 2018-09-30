package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.anonymous.homnayangi.R;
import com.example.anonymous.homnayangi.RestaurantsDetailsActivity;

import java.util.List;

import model.Restaurants;

public class AdapterRestaurants extends RecyclerView.Adapter<AdapterRestaurants.ViewHolder>{

    private List<Restaurants> list;
    private Context context;
    private int resource;

    public AdapterRestaurants(List<Restaurants> list, Context context, int resource) {
        this.list = list;
        this.context = context;
        this.resource = resource;
    }


    @NonNull
    @Override
    public AdapterRestaurants.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(this.resource,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRestaurants.ViewHolder holder, final int position) {
        holder.txtTitle.setText(list.get(position).getTitle());
        holder.imgRestaurants.setImageResource(list.get(position).getImage());
        holder.txtAddress.setText(list.get(position).getAddress());
        holder.txtTitle.setText(list.get(position).getSpecies());

            holder.parent_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, RestaurantsDetailsActivity.class);
                    intent.putExtra("IMAGE_RESTAURANTS",list.get(position).getImage());
                    intent.putExtra("TITLE_RESTAURANTS",list.get(position).getTitle());
                    intent.putExtra("ADDRESS_RESTAURANTS",list.get(position).getAddress());
                    intent.putExtra("OPENANDCLOSE",list.get(position).getOpenAndClose());
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TextView txtAddress;
        ImageView imgRestaurants;
        RelativeLayout parent_layout;
        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            imgRestaurants = itemView.findViewById(R.id.imgRestaurant);
            parent_layout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
