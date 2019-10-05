package com.example.rahul.retrofitrestapi;

import android.app.ProgressDialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.HolderV> {
    Context c;
    ProgressDialog mProgressDialog;
    List<ModelProductListResponse.Datum> data;

    public ProductListAdapter(Context c, List<ModelProductListResponse.Datum> body) {
        this.c = c;
        this.data = body;
    }

    @NonNull
    @Override
    public HolderV onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HolderV(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_product, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final HolderV holderV, final int i) {
        String vehicalEquipment = data.get(i).getVehicleEquipmentName() != null ? data.get(i).getVehicleEquipmentName() : "";
        String capacity = data.get(i).getCapacity() != null ? data.get(i).getCapacity() : "";
        String mobilization = data.get(i).getMobilization() != null ? data.get(i).getMobilization() : "";
        String deMobilization = data.get(i).getDemobilization() != null ? data.get(i).getDemobilization() : "";
        Glide.with(c).load("" + data.get(i).getImg()).into(holderV.ivImgHome);
        holderV.tTitle.setText(data.get(i).getMonthlyPrice() != null ? data.get(i).getMonthlyPrice() + " ر.ع." : " ر.ع.");
        holderV.tProductSubTitle.setText(vehicalEquipment + " - " + capacity);
        holderV.tProductAvailability.setText("Availability:\n" + mobilization + " to " + deMobilization);

    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class HolderV extends RecyclerView.ViewHolder {
        ImageView ivImgHome, ivWishlist;
        LinearLayout llHolder;
        TextView tProductSmallDesc, tProductSubTitle, tTitle, tProductAvailability;

        public HolderV(@NonNull View itemView) {
            super(itemView);
            ivImgHome = itemView.findViewById(R.id.viewPager);
            llHolder = itemView.findViewById(R.id.llHolder);
            tProductSubTitle = itemView.findViewById(R.id.tProductSubTitle);
            tTitle = itemView.findViewById(R.id.tTitle);
            tProductSmallDesc = itemView.findViewById(R.id.tProductSmallDesc);
            tProductAvailability = itemView.findViewById(R.id.tProductAvailability);

        }
    }


}
