package com.bhram.radhakrishnavachanpk;


import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class photoAdapter  extends RecyclerView.Adapter<photoAdapter.ViewHolder> {

    List<imageItem> list;

    public photoAdapter(List<imageItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public photoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_item_container,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull photoAdapter.ViewHolder holder, int position) {
Picasso.get().load(Uri.parse(list.get(position).getImageUrl())).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);


        }



//
//
//    private Context context;
//    private String[] imageUrls;
//
//    photoAdapter( Context context, String[] imageUrls){
//        this.context = context ;
//        this.imageUrls = imageUrls;
//    }
//    @Override
//    public int getCount() {
//        return imageUrls.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//
//        ImageView imageView = new ImageView(context);
//        Picasso.get()
//                .load(imageUrls[position])
//                .fit()
//                .centerCrop()
//                .into(imageView);
//        container.addView(imageView);
//
//        return imageView;
//    }
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//
//        container.removeView((View) object);
   }


}
