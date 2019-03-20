package com.example.android.takehomeassignment08_yanyingl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ImagesAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private List<lists> views;
    private Context context;

    public ImagesAdapter(List<lists>views,Context context){
        this.views=views;
        this.context=context;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ImageViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position){
        lists question=views.get(position);
        holder.nameView.setText(question.name);
        holder.descriptionView.setText(question.description);
        holder.ImageView.setImageResource(question.photoId);
    }

    @Override
    public int getItemCount(){return views.size();}
}


