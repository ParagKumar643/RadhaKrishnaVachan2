package com.bhram.radhakrishnavachanpk;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.VideoViewHolder> {

    private List<VideoItem> videoItems;
    public static String demo;


    public VideosAdapter(List<VideoItem> videoItems) {
        this.videoItems = videoItems;
    }

    @NonNull
    @Override
    public VideosAdapter.VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_video,
                        parent,
                        false
                )
        );


    }

    @Override
    public void onBindViewHolder(@NonNull final VideosAdapter.VideoViewHolder holder, int position) {
 holder.setVideoData(videoItems.get(position));



    }

    @Override
    public int getItemCount() {
        return videoItems.size();
    }

    static class VideoViewHolder extends RecyclerView.ViewHolder {

        VideoView videoView;



    ProgressBar progressBar;



        public VideoViewHolder(@NonNull View itemView){
            super(itemView);


            videoView = itemView.findViewById(R.id.videoView);

            progressBar = itemView.findViewById(R.id.ProgressBar);
            progressBar.setVisibility(View.VISIBLE);


        }


        void setVideoData(VideoItem videoItem) {
//            textVideoTitle.setText(videoItem.videoTitle);
            demo = videoItem.videoURL;
            videoView.setVideoPath(videoItem.videoURL);



            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    progressBar.setVisibility(View.GONE);
                    mp.start();

                    float videoRatio = mp.getVideoWidth() / (float)mp.getVideoHeight();
                    float screanRatio = videoView.getWidth() / (float) videoView.getHeight();

                    float scale = videoRatio / screanRatio;
                    if(scale >= 1f){
                        videoView.setScaleX(scale);
                    }else {
                        videoView.setScaleY(1f / scale);
                    }
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.start();
                   
                }
            });




        }

    }
}
