package ru.haliksar.example.multimodule.data.datasource

import ru.haliksar.example.multimodule.data.api.PostApi
import ru.haliksar.example.multimodule.data.mapper.toEntityList
import ru.haliksar.example.multimodule.domain.entity.Post

class PostRemoteDataSourceImpl(
    private val api: PostApi
) : PostRemoteDataSource {

    override fun getList(): List<Post> =
        api.getPosts().toEntityList()
}