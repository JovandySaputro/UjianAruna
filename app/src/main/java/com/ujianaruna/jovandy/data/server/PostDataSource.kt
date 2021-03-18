package com.ujianaruna.jovandy.data.server

import com.example.data.RemoteDataSource
import com.example.domain.Post
import com.example.domain.User
import com.ujianaruna.jovandy.data.toDomainPost
import com.ujianaruna.jovandy.data.toDomainUser

class PostDataSource : RemoteDataSource {
    override suspend fun getUsers(): List<User> =
        PostDb.service
            .getAllUsers().await()
            .map { it.toDomainUser() }

    override suspend fun getPosts(): List<Post> =
        PostDb.service
            .getAllPost().await()
            .map { it.toDomainPost() }
}