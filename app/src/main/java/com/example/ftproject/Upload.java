package com.example.ftproject;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){

    }

    public Upload(String name, String imageurl) {
       if(name.trim().equals("")){
           name="No name";
       }

        this.mName = name;
        this.mImageUrl = imageurl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String name) {
        this.mName = name;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String imageurl) {
        this.mImageUrl = imageurl;
    }
}
