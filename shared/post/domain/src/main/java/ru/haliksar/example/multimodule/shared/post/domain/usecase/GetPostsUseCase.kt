package ru.haliksar.example.multimodule.shared.post.domain.usecase

import ru.haliksar.example.multimodule.shared.post.domain.entity.Post
import ru.haliksar.example.multimodule.shared.post.domain.repository.PostRepository

class GetPostsUseCase(
    private val repository: PostRepository
) {

    operator fun invoke(): List<Post> =
        repository.getList()
}