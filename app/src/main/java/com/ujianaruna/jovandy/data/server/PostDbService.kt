package com.ujianaruna.jovandy.data.server

import com.example.domain.Comment
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface PostDbService {

    @GET("posts")
    fun getAllPost(): Deferred<List<Post>>

    @GET("users")
    fun getAllUsers(): Deferred<List<User>>

}