package com.bhram.radhakrishnavachanpka;

public class VideoItem {
    public String videoURL , videoTitle , id;

    public VideoItem() {
    }

    public VideoItem(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
