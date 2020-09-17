package com.spdark.knight.Responses;

import com.google.gson.annotations.SerializedName;
import com.spdark.knight.Models.MediaObject;

import java.util.List;

public class Users {
    @SerializedName("ALL_POSTS")
    private List<MediaObject> AllPosts;

    public List<MediaObject> getAllPosts(){
        return  AllPosts;
    }
}
