package ru.haliksar.example.multimodule.data.repository

import ru.haliksar.example.multimodule.data.datasource.PostRemoteDataSource
import ru.haliksar.example.multimodule.domain.entity.Post
import ru.haliksar.example.multimodule.domain.repository.PostRepository

class PostRepositoryImpl(
    private val remoteDataSource: PostRemoteDataSource
) : PostRepository {

    override fun getList(): List<Post> =
        remoteDataSource.getList()
}