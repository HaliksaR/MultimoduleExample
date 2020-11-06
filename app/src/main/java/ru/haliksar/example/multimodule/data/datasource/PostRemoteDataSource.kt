package ru.haliksar.example.multimodule.data.datasource

import ru.haliksar.example.multimodule.domain.entity.Post

interface PostRemoteDataSource {

    fun getList(): List<Post>
}