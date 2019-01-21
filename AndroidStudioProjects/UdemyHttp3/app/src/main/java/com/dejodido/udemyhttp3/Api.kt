package com.dejodido.udemyhttp3

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    Call<Lista>
    Call<List<Repo>> listRepos(@Path("user") String user);
}