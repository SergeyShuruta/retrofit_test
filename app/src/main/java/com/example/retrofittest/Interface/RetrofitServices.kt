package com.example.retrofittest.Interface

import com.example.retrofittest.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}