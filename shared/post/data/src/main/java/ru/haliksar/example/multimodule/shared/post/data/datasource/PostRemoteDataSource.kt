package ru.haliksar.example.multimodule.shared.post.data.datasource

import ru.haliksar.example.multimodule.shared.post.domain.entity.Post

interface PostRemoteDataSource {

    fun getList(): List<Post>
}