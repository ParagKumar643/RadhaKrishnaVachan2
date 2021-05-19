package com.bhram.radhakrishnavachanpk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager =  root.findViewById(R.id.videosViewPager);

        List<VideoItem> videoItems = new ArrayList<>();

        VideoItem VideoItemCelebration = new VideoItem();
        VideoItemCelebration.videoURL = "https://www.youtube.com/watch?v=PhqhYUwkCXM&list=LL&index=1&ab_channel=ChiragKachhadiya";
        VideoItemCelebration.videoTitle = " celebration";
        VideoItemCelebration.videoDescription = " yo yo honey singh";
        videoItems.add(VideoItemCelebration);

        //many timesss

        videosViewPager.setAdapter(new VideosAdapter(videoItems));

        return root;
    }
}