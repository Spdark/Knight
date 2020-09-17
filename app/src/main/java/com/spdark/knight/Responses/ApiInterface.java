package com.spdark.knight.Responses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    //////////////////////////getting all the posts///////////////////
    @GET("posts.php")
    Call<Users> performAllPosts();
}
