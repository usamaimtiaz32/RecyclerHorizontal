package com.example.hotels.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotels.Modal.RecentsData;
import com.example.hotels.R;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecyclerViewHolder> {
 Context context;
 List<RecentsData>recentDataList;

    public RecentsAdapter(Context context, List<RecentsData> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recents_row,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
holder.countryName.setText(recentDataList.get(position).getCountryName());
holder.placeName.setText(recentDataList.get(position).getPlace());
holder.price.setText(recentDataList.get(position).getPrice());
holder.placeImage.setImageResource(recentDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return recentDataList.size();
    }


    public static final class RecyclerViewHolder extends RecyclerView.ViewHolder{
ImageView placeImage;
TextView placeName,countryName,price;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage=(ImageView) itemView.findViewById(R.id.placeImage);
            placeName=(TextView) itemView.findViewById(R.id.placeName);

            countryName=(TextView)itemView.findViewById(R.id.countrtyName);
            price=(TextView)itemView.findViewById(R.id.price);

        }
    }
}

