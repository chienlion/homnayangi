package adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.anonymous.homnayangi.R;

import java.util.List;

import model.Restaurants;

public class AdapterNotifications extends RecyclerView.Adapter<AdapterNotifications.ViewHolderNotification>{
    private List<Restaurants> list;
    private Context context;
    private int resource;

    public AdapterNotifications(List<Restaurants> list, Context context, int resource) {
        this.list = list;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public AdapterNotifications.ViewHolderNotification onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new ViewHolderNotification(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterNotifications.ViewHolderNotification holder, int position) {

        holder.txtTitle.setText(list.get(position).getTitle());
        holder.txtAddress.setText(list.get(position).getAddress());
        holder.txtSale.setText(list.get(position).getSale());
        holder.txtOpenAndCloseSale.setText(list.get(position).getOpenSale()+" đến "+list.get(position).getCloseSale());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolderNotification extends RecyclerView.ViewHolder {
        LinearLayout parentLayout;
        TextView txtTitle;
        TextView txtAddress;
        TextView txtSale;
        TextView txtOpenAndCloseSale;
        public ViewHolderNotification(View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            txtSale = itemView.findViewById(R.id.txtSale);
            txtOpenAndCloseSale = itemView.findViewById(R.id.txtOpenAndCloseSale);
        }
    }
}
