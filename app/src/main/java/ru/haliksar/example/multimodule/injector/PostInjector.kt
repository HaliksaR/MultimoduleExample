package ru.haliksar.example.multimodule.injector

import ru.haliksar.example.multimodule.data.api.PostApi
import ru.haliksar.example.multimodule.data.api.RetroProxy
import ru.haliksar.example.multimodule.data.datasource.PostRemoteDataSource
import ru.haliksar.example.multimodule.data.datasource.PostRemoteDataSourceImpl
import ru.haliksar.example.multimodule.data.repository.PostRepositoryImpl
import ru.haliksar.example.multimodule.domain.repository.PostRepository
import ru.haliksar.example.multimodule.domain.usecase.GetPostsUseCase

object PostInjector {

	fun useCase() : GetPostsUseCase =
        GetPostsUseCase(repository())

	fun repository() : PostRepository =
        PostRepositoryImpl(
            dataSource()
        )

	fun dataSource() : PostRemoteDataSource =
        PostRemoteDataSourceImpl(
            api()
        )

	fun api() : PostApi =
        RetroProxy()
}