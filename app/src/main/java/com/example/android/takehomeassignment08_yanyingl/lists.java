package com.example.android.takehomeassignment08_yanyingl;

public class lists {

    public int name;
    public int description;
    public int photoId;

    public lists(int name, int description, int photoId) {
        this.name = name;
        this.description = description;
        this.photoId = photoId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}

