package com.example.testproject.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.testproject.model.Cards;
import com.example.testproject.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Cards> mData;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<Cards> mData) {
        this.mContext = mContext;
        this.mData = mData;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.cards_row_item, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tv_name.setText(mData.get(i).getName());
        myViewHolder.tv_artist.setText(mData.get(i).getArtist());
        myViewHolder.tv_flavor.setText(mData.get(i).getFlavor());

        Glide.with(mContext).load(mData.get(i).getId()).apply(option).into(myViewHolder.img_thumbnail);


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_artist;
        TextView tv_flavor;
        ImageView img_thumbnail;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.card_name);
            tv_artist = itemView.findViewById(R.id.artist);
            tv_flavor = itemView.findViewById(R.id.flavor);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);

        }
    }

}
