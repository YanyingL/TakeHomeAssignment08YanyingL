package com.example.android.takehomeassignment08_yanyingl;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView nameView;
    public TextView descriptionView;
    public ImageView ImageView;

    public ImageViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        nameView = (TextView) itemView.findViewById(R.id.name);
        descriptionView = (TextView) itemView.findViewById(R.id.description);
        ImageView = (ImageView) itemView.findViewById(R.id.image);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(context, "Like!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
