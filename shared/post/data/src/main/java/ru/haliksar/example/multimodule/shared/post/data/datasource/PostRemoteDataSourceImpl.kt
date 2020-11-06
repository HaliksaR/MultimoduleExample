package ru.haliksar.example.multimodule.shared.post.data.datasource

import ru.haliksar.example.multimodule.shared.post.data.api.PostApi
import ru.haliksar.example.multimodule.shared.post.data.mapper.toEntityList
import ru.haliksar.example.multimodule.shared.post.domain.entity.Post

class PostRemoteDataSourceImpl(
    private val api: PostApi
) : PostRemoteDataSource {

    override fun getList(): List<Post> =
        api.getPosts().toEntityList()
}