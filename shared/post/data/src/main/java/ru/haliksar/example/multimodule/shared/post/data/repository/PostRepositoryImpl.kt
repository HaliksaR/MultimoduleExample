package ru.haliksar.example.multimodule.shared.post.data.repository

import ru.haliksar.example.multimodule.shared.post.data.datasource.PostRemoteDataSource
import ru.haliksar.example.multimodule.shared.post.domain.entity.Post
import ru.haliksar.example.multimodule.shared.post.domain.repository.PostRepository

class PostRepositoryImpl(
    private val remoteDataSource: PostRemoteDataSource
) : PostRepository {

    override fun getList(): List<Post> =
        remoteDataSource.getList()
}