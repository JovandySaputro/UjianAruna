package com.ujianaruna.jovandy.data

import com.example.domain.Post
import com.example.domain.User
import com.ujianaruna.jovandy.data.database.Post as DomainPost
import com.ujianaruna.jovandy.data.database.User as DomainUser
import com.ujianaruna.jovandy.data.server.Post as ServerPost
import com.ujianaruna.jovandy.data.server.User as ServerUser

fun Post.toRoomPost(): DomainPost {
    return DomainPost(
        postId,
        userId,
        title,
        body,
        wasRead,
        favorite
    )
}

fun DomainPost.toDomainPost(): Post {
    return Post(
        postId,
        userId,
        title,
        body,
        wasRead,
        favorite
    )
}

fun ServerPost.toDomainPost(): Post {
    return Post(
        postId,
        userId,
        title,
        body,
        wasRead,
        favorite
    )
}

fun User.toRoomUser(): DomainUser {
    return DomainUser(
        userId,
        name,
        email,
        phone,
        website
    )
}

fun DomainUser.toDomainUser(): User {
    return User(
        userId,
        name,
        email,
        phone,
        website
    )
}

fun ServerUser.toDomainUser(): User {
    return User(
        userId,
        name,
        email,
        phone,
        website
    )
}