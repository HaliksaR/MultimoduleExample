package ru.haliksar.example.multimodule.domain.usecase

import ru.haliksar.example.multimodule.domain.entity.Post
import ru.haliksar.example.multimodule.domain.repository.PostRepository

class GetPostsUseCase(
    private val repository: PostRepository
) {

    operator fun invoke(): List<Post> =
        repository.getList()
}