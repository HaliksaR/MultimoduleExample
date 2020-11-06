package ru.haliksar.example.multimodule.feature.home

import ru.haliksar.example.multimodule.shared.post.data.api.PostApi
import ru.haliksar.example.multimodule.shared.post.data.api.RetroProxy
import ru.haliksar.example.multimodule.shared.post.data.datasource.PostRemoteDataSource
import ru.haliksar.example.multimodule.shared.post.data.datasource.PostRemoteDataSourceImpl
import ru.haliksar.example.multimodule.shared.post.data.repository.PostRepositoryImpl
import ru.haliksar.example.multimodule.shared.post.domain.repository.PostRepository
import ru.haliksar.example.multimodule.shared.post.domain.usecase.GetPostsUseCase

object PostInjector {

	fun useCase() : GetPostsUseCase =
        GetPostsUseCase(repository())

	fun repository() : PostRepository =
        PostRepositoryImpl(dataSource())

	fun dataSource() : PostRemoteDataSource =
        PostRemoteDataSourceImpl(api())

	fun api() : PostApi =
        RetroProxy()
}