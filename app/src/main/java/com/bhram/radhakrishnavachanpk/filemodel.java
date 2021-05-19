package com.bhram.radhakrishnavachanpk;

public class filemodel {
    String Title,URL;

    public filemodel(){

    }

    public filemodel(String title, String URL) {
        Title = title;
        this.URL = URL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
