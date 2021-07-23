package com.bhram.radhakrishnavachanpka.wallpaper;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bhram.radhakrishnavachanpka.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Myclass> {

    SecongPage secongPage;
    ArrayList<String> imgArrylist;

    public RecyclerViewAdapter(SecongPage secongPage, ArrayList<String> imgArrylist) {
        this.imgArrylist=imgArrylist;
        this.secongPage=secongPage;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(secongPage).inflate(R.layout.recycler_imgae_item,parent,false);
        return new Myclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, final int position) {

        Glide.with(secongPage).load(imgArrylist.get(position)).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pagerIntent=new Intent(secongPage,WallpaerPagerActivity.class);

                pagerIntent.putExtra("list",imgArrylist);
                pagerIntent.putExtra("pos",position);

                secongPage.startActivity(pagerIntent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return imgArrylist.size();
    }

    class Myclass extends RecyclerView.ViewHolder {

        ImageView imageView;

        public Myclass(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
        }
    }
}
